package com.example.hw38

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hw38.databinding.ActivityMainBinding
import com.example.hw38.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private val carList = arrayListOf<Car>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = CarsAdapter(carList,this::onClick)
        binding.recycler.adapter = adapter
    }

    private fun loadData() {
        carList.add(Car("Mercedes - Benz","https://www.pngall.com/wp-content/uploads/2016/05/Mercedes-Benz-PNG-Pic.png","Type\tSubsidiary (AG)[1]\n" +
                "Industry\tAutomotive\n" +
                "Predecessor\tMercedes-Benz division of Daimler AG\n" +
                "Founded\tNovember 2019; 2 years ago\n" +
                "Headquarters\tStuttgart, Germany\n" +
                "Area served\tWorldwide\n" +
                "Key people\tOla Källenius, Chairman of the Board of Management and CEO[2]\n" +
                "Products\t\n" +
                "Automobiles\n" +
                "Light commercial vehicles\n" +
                "Production output\t2,164,187 cars worldwide (2020)[3]\n" +
                "Brands\t\n" +
                "Mercedes-Benz\n" +
                "Mercedes-EQ\n" +
                "Mercedes-Maybach\n" +
                "Services\t\n" +
                "Financial services\n" +
                "Automobile repair\n" +
                "Revenue\t93,877,000,000 euro (2019) \n" +
                "Operating income\t3,359,000,000 euro (2019) \n" +
                "Total assets\t26,289,000,000 euro (2018) \n" +
                "Number of employees\t158,000 (2021) \n" +
                "Parent\tMercedes-Benz Group[1]\n" +
                "Divisions\t\n" +
                "Mercedes-Benz Cars[4]\n" +
                "Mercedes-Benz Vans\n" +
                "Subsidiaries\t\n" +
                "Mercedes-AMG[5]\n" +
                "Smart Automobile (50%)"))
        carList.add(Car("Porsche","https://www.pngall.com/wp-content/uploads/2016/04/Porsche-Free-Download-PNG.png","Type\tPublic (AG)\n" +
                "Traded as\tFWB: P911\n" +
                "ISIN\tDE000PAG9113\n" +
                "Industry\tAutomotive\n" +
                "Founded\t1931; 91 years ago in Stuttgart, Germany\n" +
                "Founder\tFerdinand Porsche\n" +
                "Headquarters\tStuttgart, Germany\n" +
                "Area served\tWorldwide\n" +
                "Key people\tWolfgang Porsche, Chairman\n" +
                "Oliver Blume, CEO[1]\n" +
                "Products\tAutomobiles\n" +
                "Production output\tIncrease 301,915 vehicles (2021)[2]\n" +
                "Services\tAutomotive financial services, engineering services, investment management\n" +
                "Revenue\tIncrease €33.138 billion (2021)[2]\n" +
                "Operating income\tIncrease €5.314 billion (2021)[2]\n" +
                "Net income\tIncrease €4.038 billion (2021)[2]\n" +
                "Total assets\tIncrease €51.382 billion (2021)[2]\n" +
                "Total equity\tIncrease €22.935 billion (2021)[2]\n" +
                "Owners\t\n" +
                "Volkswagen AG (75%)\n" +
                "Porsche SE (12.5%)\n" +
                "QIA (2.5%)[3]\n" +
                "Public float (10%)\n" +
                "Number of employees\t36,996 (2021)[2]\n" +
                "Subsidiaries\t\n" +
                "Mieschke Hofmann und Partner (81.8%)\n" +
                "Porsche Consulting"))
        carList.add(Car("BMW","https://pngimg.com/uploads/bmw/bmw_PNG1710.png","Type\tPublic (Aktiengesellschaft)\n" +
                "Traded as\tFWB: BMW\n" +
                "DAX Component\n" +
                "Industry\tAutomotive\n" +
                "Predecessors\tOtto Flugmaschinenfabrik\n" +
                "Rapp Motorenwerke\n" +
                "Fahrzeugfabrik Eisenach\n" +
                "Founded\t7 March 1916; 106 years ago\n" +
                "(as Bayerische Flugzeugwerke)\n" +
                "Founders\t\n" +
                "Camillo Castiglioni\n" +
                "Franz Josef Popp\n" +
                "Karl Rapp\n" +
                "Headquarters\tMunich, Germany\n" +
                "Area served\tWorldwide\n" +
                "Key people\tOliver Zipse, Chairman of the Board of Management\n" +
                "Norbert Reithofer, Chairman of the Supervisory Board\n" +
                "Products\t\n" +
                "CarsMotorcycles\n" +
                "Production output\t\n" +
                "Increase 2,521,514 cars (2021)\n" +
                "Increase 194,261 motorcycles (2021)[1]\n" +
                "Brands\t\n" +
                "Automobiles\n" +
                "Alpina\n" +
                "BMW\n" +
                "BMW i\n" +
                "BMW M\n" +
                "BMW X\n" +
                "DriveNow\n" +
                "Mini\n" +
                "Rolls-Royce\n" +
                "Motorcycles\n" +
                "BMW Motorrad\n" +
                "Services\tFinancial services\n" +
                "Revenue\tIncrease €111.239 billion (2021)[1]\n" +
                "Operating income\tIncrease €16.060 billion (2021)[1]\n" +
                "Net income\tIncrease €12.463 billion (2021)[1]\n" +
                "Total assets\tIncrease €229.527 billion (2021)[1]\n" +
                "Total equity\tIncrease €75.132 billion (2021)[1]\n" +
                "Owners\tPublic float (50%);\n" +
                "Stefan Quandt (29%),\n" +
                "Susanne Klatten (21%)\n" +
                "Number of employees\t118,909 (2021)[1]"))
        carList.add(Car("Daewoo","https://www.picng.com/upload/daewoo/png_daewoo_19931.png","Type\tChaebol\n" +
                "Founded\t22 March 1967; 55 years ago\n" +
                "Founder\tKim Woo-choong\n" +
                "Defunct\t1 November 1999; 22 years ago\n" +
                "Fate\tDeclared bankruptcy (see details)\n" +
                "Headquarters\tSeoul, South Korea\n" +
                "Number of employees\t320,000[1][2]\n" +
                "Divisions\t\n" +
                "List\n" +
                "Subsidiaries\t\n" +
                "Corona Data Systems\n" +
                "Leading Edge\n" +
                "OCN (TV channel)\n" +
                "SNT Motiv"))
        carList.add(Car("Lexus","https://w7.pngwing.com/pngs/264/550/png-transparent-lexus-nx-car-sport-utility-vehicle-lexus-rx-hybrid-car-compact-car-car-vehicle.png","Type\tDivision\n" +
                "Industry\tAutomotive\n" +
                "Founded\t1989; 33 years ago[1]\n" +
                "Founder\tEiji Toyoda\n" +
                "Headquarters\tNagoya, Japan\n" +
                "Area served\tWorldwide\n" +
                "Key people\tKoji Sato (President)[2]\n" +
                "David Nordstrom (VP, Asia Pacific)[3]\n" +
                "Spiros Fotinos (VP, EU)[4]\n" +
                "Andrew Gilleland (VP, U.S.)[5]\n" +
                "Products\tLuxury vehicles\n" +
                "Performance vehicles\n" +
                "Brands\tF marque\n" +
                "Services\tAutomotive financing\n" +
                "Parent\tToyota"))
        carList.add(Car("Toyota","https://s3.envato.com/files/318363320/Toyota%20Supra%20(2020)%20-%201.png","Type\tPublic\n" +
                "Traded as\t\n" +
                "TYO: 7203\n" +
                "NAG: 7203\n" +
                "NYSE: TM\n" +
                "LSE: TYT\n" +
                "Nikkei 225 component (TYO)\n" +
                "TOPIX Core30 component (TYO)\n" +
                "ISIN\tJP3633400001\n" +
                "Industry\tAutomotive\n" +
                "Founded\tAugust 28, 1937; 85 years ago\n" +
                "Founder\tKiichiro Toyoda\n" +
                "Headquarters\tToyota City, Aichi, Japan\n" +
                "Area served\tWorldwide\n" +
                "Key people\t\n" +
                "Takeshi Uchiyamada (chairman)\n" +
                "Shigeru Hayakawa (Vice chairman)\n" +
                "Akio Toyoda (president)\n" +
                "Production output\t\n" +
                "Decrease 9,472,556 (FY21)\n" +
                "Decrease 9,213,195 (2020)\n" +
                "Services\tBanking, financing, leasing\n" +
                "Revenue\t\n" +
                "Decrease ¥27,214,594 million\n" +
                "Decrease US\$256.7 billion (FY21)\n" +
                "Operating income\tDecrease ¥2,197,748 million (FY21)\n" +
                "Net income\tIncrease ¥2,282,378 million (FY21)\n" +
                "Total assets\t\n" +
                "Increase ¥62,267,140 million\n" +
                "Increase US\$562 billion (FY21)\n" +
                "Total equity\tIncrease ¥24,288,329 million (FY21)\n" +
                "Number of employees\tIncrease 366,283 (FY21)\n" +
                "Parent\tToyota Group through cross ownership:\n" +
                "Toyota Industries cross-owns 8.28%\n" +
                "Subaru Corporation cross-owns 3.17%\n" +
                "Denso cross-owns 3.12%\n" +
                "Mazda cross-owns 0.25%\n" +
                "Suzuki cross-owns 0.2%\n" +
                "Divisions\t\n" +
                "Lexus\n" +
                "Scion (defunct)\n" +
                "Subsidiaries\t\n" +
                "Daihatsu\n" +
                "Denso (25%)\n" +
                "FAW Toyota (China, 50%)\n" +
                "GAC Toyota (China, 50%)\n" +
                "Hino Motors\n" +
                "Subaru Corporation (20%)\n" +
                "Toyota Argentina\n" +
                "Toyota Auto Body\n" +
                "Toyota Financial Services\n" +
                "Toyota Kirloskar Motors\n" +
                "Toyota Motor Corporation Australia\n" +
                "Toyota Motor Europe\n" +
                "Toyota Motor East Japan\n" +
                "Toyota Motor Kyushu\n" +
                "Toyota Motor Manufacturing Indonesia (95%)\n" +
                "Toyota Motor North America\n" +
                "Toyota Motor Pakistan\n" +
                "Toyota Motor Philippines\n" +
                "Toyota Motor Thailand (86%)\n" +
                "Toyota South Africa Motors"))
        carList.add(Car("Lada","https://www.pngmart.com/files/9/Lada-PNG-Free-Download.png","Owner\tAvtoVAZ\n" +
                "Country\tRussia\n" +
                "Introduced\t1973"))
        carList.add(Car("Chevrolet","https://pngimg.com/uploads/chevrolet/%D1%81hevrolet_PNG153.png","Formerly\t\n" +
                "Chevrolet Motor Company\n" +
                "Chevrolet Motor Division of General Motors Company\n" +
                "Type\tPrivate (1911–18)\n" +
                "Division (1918–present)\n" +
                "Industry\tAutomotive\n" +
                "Founded\tNovember 3, 1911; 110 years ago\n" +
                "Founder\tArthur and Louis Chevrolet\n" +
                "William C. Durant\n" +
                "Fate\tAcquired by General Motors in 1918 [1]\n" +
                "Headquarters\tDetroit, Michigan, U.S.\n" +
                "Area served\t\n" +
                "Americas\n" +
                "Cambodia\n" +
                "China (excl. Hong Kong and Macau)\n" +
                "Europe (excl. Russia)\n" +
                "Japan\n" +
                "South Korea\n" +
                "Middle East\n" +
                "Philippines\n" +
                "Singapore\n" +
                "Australasia\n" +
                "Key people\tAlan Batey, senior vice president[2]\n" +
                "Products\tAutomobiles\n" +
                "Commercial vehicles\n" +
                "Trucks\n" +
                "Services\t\n" +
                "Vehicle FinancingInsuranceMaintenanceRepairsSales\n" +
                "Parent\tGeneral Motors"))
    }
    private fun onClick(position:Int){
        val bundle = Bundle()
        bundle.putSerializable("key",carList[position])
        findNavController().navigate(R.id.secondFragment,bundle)
    }

}