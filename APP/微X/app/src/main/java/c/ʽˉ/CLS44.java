// Decompiled by JEB v5.42.0.202606242140

package c.ʽˉ;

import c.ˎˊ.CLS118;
import com.google.zxing.FormatException;

public final class CLS44 {
    public final CLS43 FLD165;
    public final CLS118 FLD166;
    public final StringBuilder FLD167;

    public CLS44(CLS118 ˆٴ0) {
        this.FLD165 = new CLS43();
        this.FLD167 = new StringBuilder();
        this.FLD166 = ˆٴ0;
    }

    public final CLS410 MTH959(int v) {
        int v1 = this.MTH974(v, 5);
        if(v1 == 15) {
            return new CLS410(v + 5, '$');
        }
        if(v1 >= 5 && v1 < 15) {
            return new CLS410(v + 5, ((char)(v1 + 43)));
        }
        int v2 = this.MTH974(v, 6);
        if(v2 >= 0x20 && v2 < 58) {
            return new CLS410(v + 6, ((char)(v2 + 33)));
        }
        switch(v2) {
            case 58: {
                return new CLS410(v + 6, '*');
            }
            case 59: {
                return new CLS410(v + 6, ',');
            }
            case 60: {
                return new CLS410(v + 6, '-');
            }
            case 61: {
                return new CLS410(v + 6, '.');
            }
            case 62: {
                return new CLS410(v + 6, '/');
            }
            default: {
                throw new IllegalStateException("Decoding invalid alphanumeric value: " + v2);
            }
        }
    }

    public final boolean MTH960(int v) {
        if(v + 5 > this.FLD166.MTH2347()) {
            return false;
        }
        int v1 = this.MTH974(v, 5);
        if(v1 >= 5 && v1 < 16) {
            return true;
        }
        if(v + 7 > this.FLD166.MTH2347()) {
            return false;
        }
        int v2 = this.MTH974(v, 7);
        if(v2 >= 0x40 && v2 < 0x74) {
            return true;
        }
        if(v + 8 > this.FLD166.MTH2347()) {
            return false;
        }
        int v3 = this.MTH974(v, 8);
        return v3 >= 0xE8 && v3 < 0xFD;
    }

    public final CLS411 MTH961(int v) {
        if(v + 7 > this.FLD166.MTH2347()) {
            int v1 = this.MTH974(v, 4);
            return v1 == 0 ? new CLS411(this.FLD166.MTH2347(), 10, 10) : new CLS411(this.FLD166.MTH2347(), v1 - 1, 10);
        }
        int v2 = this.MTH974(v, 7);
        return new CLS411(v + 7, (v2 - 8) / 11, (v2 - 8) % 11);
    }

    public final CLS408 MTH962() {
        CLS39 ʾˆ0;
        do {
            int v = this.FLD165.MTH952();
            if(this.FLD165.MTH953()) {
                ʾˆ0 = this.MTH965();
            }
            else {
                ʾˆ0 = this.FLD165.MTH957() ? this.MTH967() : this.MTH968();
            }
            boolean z = ʾˆ0.MTH909();
        }
        while((v != this.FLD165.MTH952() || z) && !z);
        return ʾˆ0.MTH910();
    }

    public String MTH963(StringBuilder stringBuilder0, int v) {
        for(String s = null; true; s = s2) {
            CLS408 ˆˆ0 = this.MTH971(v, s);
            String s1 = CLS45.MTH980(ˆˆ0.MTH918());
            if(s1 != null) {
                stringBuilder0.append(s1);
            }
            String s2 = ˆˆ0.MTH920() ? String.valueOf(ˆˆ0.MTH919()) : null;
            if(v == ((CLS40)ˆˆ0).MTH939()) {
                break;
            }
            v = ((CLS40)ˆˆ0).MTH939();
        }
        return stringBuilder0.toString();
    }

    public final boolean MTH964(int v) {
        if(v + 5 > this.FLD166.MTH2347()) {
            return false;
        }
        int v1 = this.MTH974(v, 5);
        if(v1 >= 5 && v1 < 16) {
            return true;
        }
        if(v + 6 > this.FLD166.MTH2347()) {
            return false;
        }
        int v2 = this.MTH974(v, 6);
        return v2 >= 16 && v2 < 0x3F;
    }

    public final CLS39 MTH965() {
        while(this.MTH964(this.FLD165.MTH952())) {
            CLS410 ˋˑ0 = this.MTH959(this.FLD165.MTH952());
            int v = ((CLS40)ˋˑ0).MTH939();
            this.FLD165.MTH955(v);
            if(ˋˑ0.MTH928()) {
                return new CLS39(new CLS408(this.FLD165.MTH952(), this.FLD167.toString()), true);
            }
            this.FLD167.append(ˋˑ0.MTH927());
        }
        if(this.MTH973(this.FLD165.MTH952())) {
            this.FLD165.MTH950(3);
            this.FLD165.MTH954();
            return new CLS39(false);
        }
        if(this.MTH966(this.FLD165.MTH952())) {
            if(this.FLD165.MTH952() + 5 < this.FLD166.MTH2347()) {
                this.FLD165.MTH950(5);
            }
            else {
                this.FLD165.MTH955(this.FLD166.MTH2347());
            }
            this.FLD165.MTH956();
        }
        return new CLS39(false);
    }

    public final boolean MTH966(int v) {
        if(v + 1 > this.FLD166.MTH2347()) {
            return false;
        }
        for(int v1 = 0; v1 < 5; ++v1) {
            int v2 = v1 + v;
            if(v2 >= this.FLD166.MTH2347()) {
                break;
            }
            if(v1 == 2) {
                if(!this.FLD166.MTH2357(v + 2)) {
                    return false;
                }
            }
            else if(this.FLD166.MTH2357(v2)) {
                return false;
            }
        }
        return true;
    }

    public final CLS39 MTH967() {
        while(this.MTH960(this.FLD165.MTH952())) {
            CLS410 ˋˑ0 = this.MTH975(this.FLD165.MTH952());
            int v = ((CLS40)ˋˑ0).MTH939();
            this.FLD165.MTH955(v);
            if(ˋˑ0.MTH928()) {
                return new CLS39(new CLS408(this.FLD165.MTH952(), this.FLD167.toString()), true);
            }
            this.FLD167.append(ˋˑ0.MTH927());
        }
        if(this.MTH973(this.FLD165.MTH952())) {
            this.FLD165.MTH950(3);
            this.FLD165.MTH954();
            return new CLS39(false);
        }
        if(this.MTH966(this.FLD165.MTH952())) {
            if(this.FLD165.MTH952() + 5 < this.FLD166.MTH2347()) {
                this.FLD165.MTH950(5);
            }
            else {
                this.FLD165.MTH955(this.FLD166.MTH2347());
            }
            this.FLD165.MTH951();
        }
        return new CLS39(false);
    }

    public final CLS39 MTH968() {
        while(this.MTH970(this.FLD165.MTH952())) {
            CLS411 ˋﹳ0 = this.MTH961(this.FLD165.MTH952());
            int v = ((CLS40)ˋﹳ0).MTH939();
            this.FLD165.MTH955(v);
            if(ˋﹳ0.MTH937()) {
                return ˋﹳ0.MTH935() ? new CLS39(new CLS408(this.FLD165.MTH952(), this.FLD167.toString()), true) : new CLS39(new CLS408(this.FLD165.MTH952(), this.FLD167.toString(), ˋﹳ0.MTH936()), true);
            }
            this.FLD167.append(ˋﹳ0.MTH934());
            if(ˋﹳ0.MTH935()) {
                return new CLS39(new CLS408(this.FLD165.MTH952(), this.FLD167.toString()), true);
            }
            this.FLD167.append(ˋﹳ0.MTH936());
        }
        if(this.MTH969(this.FLD165.MTH952())) {
            this.FLD165.MTH951();
            this.FLD165.MTH950(4);
        }
        return new CLS39(false);
    }

    public final boolean MTH969(int v) {
        if(v + 1 > this.FLD166.MTH2347()) {
            return false;
        }
        for(int v1 = 0; v1 < 4; ++v1) {
            int v2 = v1 + v;
            if(v2 >= this.FLD166.MTH2347()) {
                break;
            }
            if(this.FLD166.MTH2357(v2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean MTH970(int v) {
        if(v + 7 > this.FLD166.MTH2347()) {
            return v + 4 <= this.FLD166.MTH2347();
        }
        for(int v1 = v; v1 < v + 3; ++v1) {
            if(this.FLD166.MTH2357(v1)) {
                return true;
            }
        }
        return this.FLD166.MTH2357(v + 3);
    }

    public CLS408 MTH971(int v, String s) {
        this.FLD167.setLength(0);
        if(s != null) {
            this.FLD167.append(s);
        }
        this.FLD165.MTH955(v);
        CLS408 ˆˆ0 = this.MTH962();
        return ˆˆ0 == null || !ˆˆ0.MTH920() ? new CLS408(this.FLD165.MTH952(), this.FLD167.toString()) : new CLS408(this.FLD165.MTH952(), this.FLD167.toString(), ˆˆ0.MTH919());
    }

    public static int MTH972(CLS118 ˆٴ0, int v, int v1) {
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            if(ˆٴ0.MTH2357(v + v2)) {
                v3 |= 1 << v1 - v2 - 1;
            }
        }
        return v3;
    }

    public final boolean MTH973(int v) {
        int v1 = v + 3;
        if(v1 > this.FLD166.MTH2347()) {
            return false;
        }
        while(v < v1) {
            if(this.FLD166.MTH2357(v)) {
                return false;
            }
            ++v;
        }
        return true;
    }

    public int MTH974(int v, int v1) {
        return CLS44.MTH972(this.FLD166, v, v1);
    }

    public final CLS410 MTH975(int v) {
        int v1 = this.MTH974(v, 5);
        if(v1 == 15) {
            return new CLS410(v + 5, '$');
        }
        if(v1 >= 5 && v1 < 15) {
            return new CLS410(v + 5, ((char)(v1 + 43)));
        }
        int v2 = this.MTH974(v, 7);
        if(v2 >= 0x40 && v2 < 90) {
            return new CLS410(v + 7, ((char)(v2 + 1)));
        }
        if(v2 >= 90 && v2 < 0x74) {
            return new CLS410(v + 7, ((char)(v2 + 7)));
        }
        switch(this.MTH974(v, 8)) {
            case 0xE8: {
                return new CLS410(v + 8, '!');
            }
            case 0xE9: {
                return new CLS410(v + 8, '\"');
            }
            case 0xEA: {
                return new CLS410(v + 8, '%');
            }
            case 0xEB: {
                return new CLS410(v + 8, '&');
            }
            case 0xEC: {
                return new CLS410(v + 8, '\'');
            }
            case 0xED: {
                return new CLS410(v + 8, '(');
            }
            case 0xEE: {
                return new CLS410(v + 8, ')');
            }
            case 0xEF: {
                return new CLS410(v + 8, '*');
            }
            case 0xF0: {
                return new CLS410(v + 8, '+');
            }
            case 0xF1: {
                return new CLS410(v + 8, ',');
            }
            case 0xF2: {
                return new CLS410(v + 8, '-');
            }
            case 0xF3: {
                return new CLS410(v + 8, '.');
            }
            case 0xF4: {
                return new CLS410(v + 8, '/');
            }
            case 0xF5: {
                return new CLS410(v + 8, ':');
            }
            case 0xF6: {
                return new CLS410(v + 8, ';');
            }
            case 0xF7: {
                return new CLS410(v + 8, '<');
            }
            case 0xF8: {
                return new CLS410(v + 8, '=');
            }
            case 0xF9: {
                return new CLS410(v + 8, '>');
            }
            case 0xFA: {
                return new CLS410(v + 8, '?');
            }
            case 0xFB: {
                return new CLS410(v + 8, '_');
            }
            case 0xFC: {
                return new CLS410(v + 8, ' ');
            }
            default: {
                throw FormatException.getFormatInstance();
            }
        }
    }
}

