package com.demo.productservice.ControllerTests;




import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@RunWith(SpringRunner.class)
    @WebMvcTest(OrderController.class)
    public class ProductForOrderControllerTest {

        @Autowired
        private MockMvc mockMvc;

        @MockBean
        private OrderService orderService;

        @Autowired
        ObjectMapper objectMapper;

//        @Test
//        public void postingProduct_savesTheProduct() throws Exception{
//            Product song = TestProducts.getProducts().get(0);
//            MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.post("/products")
//                    .contentType(MediaType.APPLICATION_JSON)
//                    .content(objectMapper.writeValueAsString(song));
//            mockMvc.perform(builder).andExpect(status().isOk());
//            verify(orderService, times(1)).saveO(any(Product.class));
//        }
//
//        @Test
//        public void findProductByCategory_returnsProductsWithThatCategory() throws Exception {
//            //arrange
//            List<Product> products = new ArrayList<>();
//            products.add(TestProducts.getProducts().get(0));
//            products.add(TestProducts.getProducts().get(1));
//            products.add(TestProducts.getProducts().get(2));
//
//            when(productService.findByCategory("Men")).thenReturn(products);
//
//            mockMvc.perform(MockMvcRequestBuilders.get("/products/Men"))
//                    .andExpect(status().isOk())
//                    .andExpect(jsonPath("$", hasSize(3)))
//                    .andExpect(jsonPath("$[0].category", is("Men")))
//                    .andExpect(jsonPath("$[1].category", is("Men")))
//                    .andExpect(jsonPath("$[2].category", is("Men")));
//
//            verify(productService, times(1)).findByCategory("Men");
//            verifyNoMoreInteractions(productService);
//        }
//        @Test
//        public void findProductByCategoryAndSubCategory_returnsProductsWithThatCategoryAndSubCategory() throws Exception {
//            //arrange
//            List<Product> products = new ArrayList<>();
//            products.add(TestProducts.getProducts().get(0));
//            products.add(TestProducts.getProducts().get(2));
//
//            when(productService.findByCategoryAndSubCategory("Men","Shirts")).thenReturn(products);
//
//            mockMvc.perform(MockMvcRequestBuilders.get("/products/Men/Shirts"))
//                    .andExpect(status().isOk())
//                    .andExpect(jsonPath("$", hasSize(2)))
//                    .andExpect(jsonPath("$[0].category", is("Men")))
//                    .andExpect(jsonPath("$[1].category", is("Men")))
//                    .andExpect(jsonPath("$[0].sub_category", is("Shirts")))
//                    .andExpect(jsonPath("$[1].sub_category", is("Shirts")));
//
//            verify(productService, times(1)).findByCategoryAndSubCategory("Men","Shirts");
//            verifyNoMoreInteractions(productService);
//        }



    }
