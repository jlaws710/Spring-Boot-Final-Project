import React from 'react';
import { Link } from 'react-router-dom';
// import "./photos.css";

function ProductCard({cats}) {

                    //Prints Cat name, photo, and button
    return (
        <div className='cards'>
            <h2>{cats.name} </h2>
            <img className = "catPhotos" src={cats.image_url} alt={cats.name}></img>
            <Link className='product-select-btn' to={`/${cats.id}`}>Details</Link>
        </div>
    )

}

export default ProductCard
