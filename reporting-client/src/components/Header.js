import React from 'react';
import { Link } from 'react-router-dom';

// The Header creates links that can be used to navigate
// between routes.
const Header = () => (
  <header className="header">

      <nav>
        <ul className="our_links">
          <li ><Link className="" to='/home'>Home</Link></li>
          <li ><Link className="" to='/form'>Form</Link></li>
        </ul>
      </nav>
    </header>
)

export default Header;
