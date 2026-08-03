package Yue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4293 implements InterfaceC4650 {

    /* JADX INFO: renamed from: ۥ */
    public C7237 f796;

    /* JADX INFO: renamed from: ۥ۟ */
    public C4270 f797;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Object f8817;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4293(Reader reader) {
        this.f796 = new C7237(reader, false, this);
        this.f797 = new C4270();
    }

    @Override // Yue.InterfaceC4650
    /* JADX INFO: renamed from: ۥ */
    public C4281 mo1250(String str) {
        return (C4281) this.f797.f774.get(str);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public C7862 m1251(C7864 c7864) throws IOException {
        C7862 c7862M22646 = this.f796.m22646();
        if (c7862M22646.f3117 == c7864) {
            return c7862M22646;
        }
        if (c7862M22646.f3118 == null) {
            String strM22650 = this.f796.m22650();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Expected ");
            stringBuffer.append(c7864.f3122);
            stringBuffer.append(" instead of ");
            stringBuffer.append(c7862M22646.f3117.f3122);
            throw new C4292(strM22650, stringBuffer.toString(), this.f796.m22648(), this.f796.m22647());
        }
        String strM226502 = this.f796.m22650();
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("Expected ");
        stringBuffer2.append(c7864.f3122);
        stringBuffer2.append(" instead of ");
        stringBuffer2.append(c7862M22646.f3117.f3122);
        stringBuffer2.append("(");
        stringBuffer2.append(c7862M22646.f3118);
        stringBuffer2.append(")");
        throw new C4292(strM226502, stringBuffer2.toString(), this.f796.m22648(), this.f796.m22647());
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C4270 m12394() throws IOException {
        return m12395(false);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public C4270 m12395(boolean z) throws IOException {
        while (this.f796.m22659().f3117 != C7237.f21858) {
            m12410();
        }
        if (z) {
            Hashtable hashtable = new Hashtable();
            Enumeration enumerationElements = this.f797.f773.elements();
            while (enumerationElements.hasMoreElements()) {
                C4279 c4279 = (C4279) enumerationElements.nextElement();
                hashtable.put(c4279.f785, c4279);
            }
            Enumeration enumerationElements2 = this.f797.f773.elements();
            while (enumerationElements2.hasMoreElements()) {
                AbstractC4285 abstractC4285 = ((C4279) enumerationElements2.nextElement()).f8806;
                if (abstractC4285 instanceof AbstractC4277) {
                    Enumeration enumerationElements3 = ((AbstractC4277) abstractC4285).m12345().elements();
                    while (enumerationElements3.hasMoreElements()) {
                        m12411(hashtable, this.f797, (AbstractC4285) enumerationElements3.nextElement());
                    }
                }
            }
            if (hashtable.size() == 1) {
                Enumeration enumerationElements4 = hashtable.elements();
                this.f797.f8795 = (C4279) enumerationElements4.nextElement();
            } else {
                this.f797.f8795 = null;
            }
        } else {
            this.f797.f8795 = null;
        }
        return this.f797;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m12396(C7237 c7237, C4279 c4279, C4272 c4272) throws IOException {
        C7864 c7864 = C7237.f21844;
        C7862 c7862M1251 = m1251(c7864);
        C4273 c4273 = new C4273(c7862M1251.f3118);
        c4272.f776.addElement(c4273);
        c4279.f786.put(c7862M1251.f3118, c4273);
        C7862 c7862M22646 = c7237.m22646();
        C7864 c78642 = c7862M22646.f3117;
        if (c78642 == c7864) {
            if (c7862M22646.f3118.equals("NOTATION")) {
                c4273.f778 = m12409();
            } else {
                c4273.f778 = c7862M22646.f3118;
            }
        } else if (c78642 == C7237.f21846) {
            c4273.f778 = m12406();
        }
        C7862 c7862M22659 = c7237.m22659();
        C7864 c78643 = c7862M22659.f3117;
        if (c78643 != c7864) {
            if (c78643 == C7237.f21849) {
                c7237.m22646();
                c4273.f8796 = C4278.f8805;
                c4273.f8797 = c7862M22659.f3118;
                return;
            }
            return;
        }
        c7237.m22646();
        if (c7862M22659.f3118.equals("#FIXED")) {
            c4273.f8796 = C4278.f8802;
            c4273.f8797 = c7237.m22646().f3118;
        } else {
            if (c7862M22659.f3118.equals("#REQUIRED")) {
                c4273.f8796 = C4278.f8803;
                return;
            }
            if (c7862M22659.f3118.equals("#IMPLIED")) {
                c4273.f8796 = C4278.f8804;
                return;
            }
            String strM22650 = c7237.m22650();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Invalid token in attribute declaration: ");
            stringBuffer.append(c7862M22659.f3118);
            throw new C4292(strM22650, stringBuffer.toString(), c7237.m22648(), c7237.m22647());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m12397() throws IOException {
        C7862 c7862M1251 = m1251(C7237.f21844);
        C4279 c4279 = (C4279) this.f797.f773.get(c7862M1251.f3118);
        C4272 c4272 = new C4272(c7862M1251.f3118);
        this.f797.f8794.addElement(c4272);
        if (c4279 == null) {
            c4279 = new C4279(c7862M1251.f3118);
            this.f797.f773.put(c7862M1251.f3118, c4279);
        }
        C7862 c7862M22659 = this.f796.m22659();
        while (true) {
            C7864 c7864 = c7862M22659.f3117;
            C7864 c78642 = C7237.f21852;
            if (c7864 == c78642) {
                m1251(c78642);
                return;
            } else {
                m12396(this.f796, c4279, c4272);
                c7862M22659 = this.f796.m22659();
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public AbstractC4285 m12398() throws IOException {
        AbstractC4285 abstractC4285M12401;
        C7862 c7862M22646 = this.f796.m22646();
        C7864 c7864 = c7862M22646.f3117;
        if (c7864 == C7237.f21844) {
            abstractC4285M12401 = new C4287(c7862M22646.f3118);
        } else {
            if (c7864 != C7237.f21846) {
                String strM22650 = this.f796.m22650();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Found invalid token in sequence: ");
                stringBuffer.append(c7862M22646.f3117.f3122);
                throw new C4292(strM22650, stringBuffer.toString(), this.f796.m22648(), this.f796.m22647());
            }
            abstractC4285M12401 = m12401();
        }
        abstractC4285M12401.f791 = m12399();
        return abstractC4285M12401;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public C4274 m12399() throws IOException {
        C7864 c7864 = this.f796.m22659().f3117;
        if (c7864 == C7237.f21854) {
            this.f796.m22646();
            return C4274.f8799;
        }
        if (c7864 == C7237.f21856) {
            this.f796.m22646();
            return C4274.f8800;
        }
        if (c7864 != C7237.f21855) {
            return C4274.f8798;
        }
        this.f796.m22646();
        return C4274.f8801;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m12400(C4279 c4279) throws IOException {
        AbstractC4277 abstractC4277M12401 = m12401();
        C7862 c7862M22659 = this.f796.m22659();
        abstractC4277M12401.f791 = m12399();
        C7864 c7864 = c7862M22659.f3117;
        if (c7864 == C7237.f21854) {
            abstractC4277M12401.f791 = C4274.f8799;
        } else if (c7864 == C7237.f21856) {
            abstractC4277M12401.f791 = C4274.f8800;
        } else if (c7864 == C7237.f21855) {
            abstractC4277M12401.f791 = C4274.f8801;
        } else {
            abstractC4277M12401.f791 = C4274.f8798;
        }
        c4279.f8806 = abstractC4277M12401;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public AbstractC4277 m12401() throws IOException {
        C7864 c7864 = null;
        AbstractC4277 c4275 = null;
        while (true) {
            AbstractC4285 abstractC4285M12398 = m12398();
            C7862 c7862M22646 = this.f796.m22646();
            C7864 c78642 = c7862M22646.f3117;
            C7864 c78643 = C7237.f21853;
            if (c78642 != c78643 && c78642 != C7237.f21848) {
                if (c78642 == C7237.f21847) {
                    if (c4275 == null) {
                        c4275 = new C4296();
                    }
                    c4275.m12341(abstractC4285M12398);
                    return c4275;
                }
                String strM22650 = this.f796.m22650();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Found invalid token in sequence: ");
                stringBuffer.append(c7862M22646.f3117.f3122);
                throw new C4292(strM22650, stringBuffer.toString(), this.f796.m22648(), this.f796.m22647());
            }
            if (c7864 != null && c7864 != c78642) {
                throw new C4292(this.f796.m22650(), "Can't mix separators in a choice/sequence", this.f796.m22648(), this.f796.m22647());
            }
            if (c4275 == null) {
                c4275 = c78642 == c78643 ? new C4275() : new C4296();
            }
            c4275.m12341(abstractC4285M12398);
            c7864 = c78642;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m12402(C7237 c7237, C4279 c4279) throws IOException {
        C7862 c7862M22646 = c7237.m22646();
        C7864 c7864 = c7862M22646.f3117;
        C7864 c78642 = C7237.f21844;
        if (c7864 == c78642) {
            if (c7862M22646.f3118.equals("EMPTY")) {
                c4279.f8806 = new C4280();
                return;
            }
            if (c7862M22646.f3118.equals("ANY")) {
                c4279.f8806 = new C4271();
                return;
            }
            String strM22650 = c7237.m22650();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Invalid token in entity content spec ");
            stringBuffer.append(c7862M22646.f3118);
            throw new C4292(strM22650, stringBuffer.toString(), c7237.m22648(), c7237.m22647());
        }
        C7864 c78643 = C7237.f21846;
        if (c7864 == c78643) {
            C7862 c7862M22659 = c7237.m22659();
            C7864 c78644 = c7862M22659.f3117;
            if (c78644 != c78642) {
                if (c78644 == c78643) {
                    m12400(c4279);
                }
            } else if (c7862M22659.f3118.equals("#PCDATA")) {
                m12407(c4279);
            } else {
                m12400(c4279);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m12403() throws IOException {
        C7862 c7862M1251 = m1251(C7237.f21844);
        C4279 c4279 = (C4279) this.f797.f773.get(c7862M1251.f3118);
        if (c4279 == null) {
            c4279 = new C4279(c7862M1251.f3118);
            this.f797.f773.put(c4279.f785, c4279);
        } else if (c4279.f8806 != null) {
            String strM22650 = this.f796.m22650();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Found second definition of element: ");
            stringBuffer.append(c7862M1251.f3118);
            throw new C4292(strM22650, stringBuffer.toString(), this.f796.m22648(), this.f796.m22647());
        }
        this.f797.f8794.addElement(c4279);
        m12402(this.f796, c4279);
        m1251(C7237.f21852);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m12404() throws IOException {
        boolean z;
        C4281 c4281;
        String str;
        C7862 c7862M22646 = this.f796.m22646();
        C7864 c7864 = c7862M22646.f3117;
        boolean z2 = true;
        if (c7864 == C7237.f21860) {
            c7862M22646 = m1251(C7237.f21844);
            z = true;
        } else {
            if (c7864 != C7237.f21844) {
                throw new C4292(this.f796.m22650(), "Invalid entity declaration", this.f796.m22648(), this.f796.m22647());
            }
            z = false;
        }
        if (((C4281) this.f797.f774.get(c7862M22646.f3118)) == null) {
            c4281 = new C4281(c7862M22646.f3118, this.f8817);
            this.f797.f774.put(c4281.f787, c4281);
            z2 = false;
        } else {
            c4281 = new C4281(c7862M22646.f3118, this.f8817);
        }
        this.f797.f8794.addElement(c4281);
        c4281.f788 = z;
        m12405(c4281);
        if (!c4281.f788 || (str = c4281.f8807) == null || z2) {
            return;
        }
        this.f796.m3522(c4281.f787, str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m12405(C4281 c4281) throws IOException {
        C7862 c7862M22646 = this.f796.m22646();
        C7864 c7864 = c7862M22646.f3117;
        C7864 c78642 = C7237.f21849;
        if (c7864 != c78642) {
            C7864 c78643 = C7237.f21844;
            if (c7864 != c78643) {
                throw new C4292(this.f796.m22650(), "Invalid entity definition", this.f796.m22648(), this.f796.m22647());
            }
            if (c7862M22646.f3118.equals(C4486.f9436)) {
                C4297 c4297 = new C4297();
                c4297.f790 = m1251(c78642).f3118;
                c4281.f8808 = c4297;
            } else {
                if (!c7862M22646.f3118.equals(C4486.f9435)) {
                    throw new C4292(this.f796.m22650(), "Invalid External ID specification", this.f796.m22648(), this.f796.m22647());
                }
                C4295 c4295 = new C4295();
                c4295.f799 = m1251(c78642).f3118;
                c4295.f790 = m1251(c78642).f3118;
                c4281.f8808 = c4295;
            }
            if (!c4281.f788) {
                C7862 c7862M22659 = this.f796.m22659();
                if (c7862M22659.f3117 == c78643) {
                    if (!c7862M22659.f3118.equals("NDATA")) {
                        throw new C4292(this.f796.m22650(), "Invalid NData declaration", this.f796.m22648(), this.f796.m22647());
                    }
                    this.f796.m22646();
                    c4281.f8809 = m1251(c78643).f3118;
                }
            }
        } else if (c4281.f8807 == null) {
            c4281.f8807 = c7862M22646.f3118;
        }
        m1251(C7237.f21852);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public C4282 m12406() throws IOException {
        C4282 c4282 = new C4282();
        while (true) {
            C7862 c7862M22646 = this.f796.m22646();
            C7864 c7864 = c7862M22646.f3117;
            if (c7864 != C7237.f21844 && c7864 != C7237.f21863) {
                String strM22650 = this.f796.m22650();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Invalid token in enumeration: ");
                stringBuffer.append(c7862M22646.f3117.f3122);
                throw new C4292(strM22650, stringBuffer.toString(), this.f796.m22648(), this.f796.m22647());
            }
            c4282.m1243(c7862M22646.f3118);
            C7862 c7862M22659 = this.f796.m22659();
            C7864 c78642 = c7862M22659.f3117;
            if (c78642 == C7237.f21847) {
                this.f796.m22646();
                return c4282;
            }
            if (c78642 != C7237.f21853) {
                String strM226502 = this.f796.m22650();
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("Invalid token in enumeration: ");
                stringBuffer2.append(c7862M22659.f3117.f3122);
                throw new C4292(strM226502, stringBuffer2.toString(), this.f796.m22648(), this.f796.m22647());
            }
            this.f796.m22646();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m12407(C4279 c4279) throws IOException {
        C4286 c4286 = new C4286();
        c4286.m12341(new C4291());
        this.f796.m22646();
        c4279.f8806 = c4286;
        boolean z = true;
        while (true) {
            C7862 c7862M22646 = this.f796.m22646();
            C7864 c7864 = c7862M22646.f3117;
            if (c7864 == C7237.f21847) {
                C7862 c7862M22659 = this.f796.m22659();
                if (c7862M22659.f3117 == C7237.f21856) {
                    this.f796.m22646();
                    c4286.f791 = C4274.f8800;
                    return;
                } else {
                    if (z) {
                        c4286.f791 = C4274.f8798;
                        return;
                    }
                    String strM22650 = this.f796.m22650();
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Invalid token in Mixed content type, '*' required after (#PCDATA|xx ...): ");
                    stringBuffer.append(c7862M22659.f3117.f3122);
                    throw new C4292(strM22650, stringBuffer.toString(), this.f796.m22648(), this.f796.m22647());
                }
            }
            if (c7864 != C7237.f21853) {
                String strM226502 = this.f796.m22650();
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("Invalid token in Mixed content type: ");
                stringBuffer2.append(c7862M22646.f3117.f3122);
                throw new C4292(strM226502, stringBuffer2.toString(), this.f796.m22648(), this.f796.m22647());
            }
            c4286.m12341(new C4287(this.f796.m22646().f3118));
            z = false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m12408() throws IOException {
        C4288 c4288 = new C4288();
        C7864 c7864 = C7237.f21844;
        String str = m1251(c7864).f3118;
        c4288.f793 = str;
        this.f797.f8792.put(str, c4288);
        this.f797.f8794.addElement(c4288);
        C7862 c7862M1251 = m1251(c7864);
        if (c7862M1251.f3118.equals(C4486.f9436)) {
            C4297 c4297 = new C4297();
            c4297.f790 = m1251(C7237.f21849).f3118;
            c4288.f794 = c4297;
        } else if (c7862M1251.f3118.equals(C4486.f9435)) {
            C4295 c4295 = new C4295();
            C7864 c78642 = C7237.f21849;
            c4295.f799 = m1251(c78642).f3118;
            c4295.f790 = null;
            if (this.f796.m22659().f3117 == c78642) {
                c4295.f790 = this.f796.m22646().f3118;
            }
            c4288.f794 = c4295;
        }
        m1251(C7237.f21852);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public C4289 m12409() throws IOException {
        C4289 c4289 = new C4289();
        C7862 c7862M22646 = this.f796.m22646();
        if (c7862M22646.f3117 != C7237.f21846) {
            String strM22650 = this.f796.m22650();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Invalid token in notation: ");
            stringBuffer.append(c7862M22646.f3117.f3122);
            throw new C4292(strM22650, stringBuffer.toString(), this.f796.m22648(), this.f796.m22647());
        }
        while (true) {
            C7862 c7862M226462 = this.f796.m22646();
            if (c7862M226462.f3117 != C7237.f21844) {
                String strM226502 = this.f796.m22650();
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("Invalid token in notation: ");
                stringBuffer2.append(c7862M226462.f3117.f3122);
                throw new C4292(strM226502, stringBuffer2.toString(), this.f796.m22648(), this.f796.m22647());
            }
            c4289.m1247(c7862M226462.f3118);
            C7862 c7862M22659 = this.f796.m22659();
            C7864 c7864 = c7862M22659.f3117;
            if (c7864 == C7237.f21847) {
                this.f796.m22646();
                return c4289;
            }
            if (c7864 != C7237.f21853) {
                String strM226503 = this.f796.m22650();
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("Invalid token in notation: ");
                stringBuffer3.append(c7862M22659.f3117.f3122);
                throw new C4292(strM226503, stringBuffer3.toString(), this.f796.m22648(), this.f796.m22647());
            }
            this.f796.m22646();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m12410() throws IOException {
        C7862 c7862M22646 = this.f796.m22646();
        C7864 c7864 = c7862M22646.f3117;
        if (c7864 != C7237.f21843) {
            if (c7864 == C7237.f21861) {
                C7862 c7862M1251 = m1251(C7237.f21844);
                if (c7862M1251.f3118.equals("IGNORE")) {
                    this.f796.m22664();
                    return;
                }
                if (c7862M1251.f3118.equals("INCLUDE")) {
                    this.f796.m22665(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
                    return;
                }
                String strM22650 = this.f796.m22650();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Invalid token in conditional: ");
                stringBuffer.append(c7862M1251.f3118);
                throw new C4292(strM22650, stringBuffer.toString(), this.f796.m22648(), this.f796.m22647());
            }
            if (c7864 == C7237.f21862) {
                return;
            }
            if (c7864 == C7237.f21859) {
                this.f797.f8794.addElement(new C4276(c7862M22646.f3118));
                return;
            }
            if (c7864 != C7237.f21851) {
                String strM226502 = this.f796.m22650();
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("Unexpected token: ");
                stringBuffer2.append(c7862M22646.f3117.f3122);
                stringBuffer2.append("(");
                stringBuffer2.append(c7862M22646.f3118);
                stringBuffer2.append(")");
                throw new C4292(strM226502, stringBuffer2.toString(), this.f796.m22648(), this.f796.m22647());
            }
            C7862 c7862M12512 = m1251(C7237.f21844);
            if (c7862M12512.f3118.equals("ELEMENT")) {
                m12403();
                return;
            }
            if (c7862M12512.f3118.equals("ATTLIST")) {
                m12397();
                return;
            }
            if (c7862M12512.f3118.equals("ENTITY")) {
                m12404();
                return;
            } else if (c7862M12512.f3118.equals("NOTATION")) {
                m12408();
                return;
            } else {
                m12412(C7237.f21852);
                return;
            }
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        while (true) {
            stringBuffer3.append(this.f796.m22649('?'));
            if (this.f796.m22659().f3117 == C7237.f21852) {
                this.f796.m22646();
                this.f797.f8794.addElement(new C4294(stringBuffer3.toString()));
                return;
            }
            stringBuffer3.append('?');
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m12411(Hashtable hashtable, C4270 c4270, AbstractC4285 abstractC4285) {
        if (abstractC4285 instanceof C4287) {
            hashtable.remove(((C4287) abstractC4285).f792);
        } else if (abstractC4285 instanceof AbstractC4277) {
            Enumeration enumerationElements = ((AbstractC4277) abstractC4285).m12345().elements();
            while (enumerationElements.hasMoreElements()) {
                m12411(hashtable, c4270, (AbstractC4285) enumerationElements.nextElement());
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m12412(C7864 c7864) throws IOException {
        C7862 c7862M22646 = this.f796.m22646();
        while (c7862M22646.f3117 != c7864) {
            c7862M22646 = this.f796.m22646();
        }
    }

    public C4293(Reader reader, boolean z) {
        this.f796 = new C7237(reader, z, this);
        this.f797 = new C4270();
    }

    public C4293(File file) throws IOException {
        this.f8817 = file.getParentFile();
        this.f796 = new C7237(new BufferedReader(new FileReader(file)), false, this);
        this.f797 = new C4270();
    }

    public C4293(File file, boolean z) throws IOException {
        this.f8817 = file.getParentFile();
        this.f796 = new C7237(new BufferedReader(new FileReader(file)), z, this);
        this.f797 = new C4270();
    }

    public C4293(URL url) throws IOException {
        String file = url.getFile();
        this.f8817 = new URL(url.getProtocol(), url.getHost(), url.getPort(), file.substring(0, file.lastIndexOf(47) + 1));
        this.f796 = new C7237(new BufferedReader(new InputStreamReader(url.openStream())), false, this);
        this.f797 = new C4270();
    }

    public C4293(URL url, boolean z) throws IOException {
        String file = url.getFile();
        this.f8817 = new URL(url.getProtocol(), url.getHost(), url.getPort(), file.substring(0, file.lastIndexOf(47) + 1));
        this.f796 = new C7237(new BufferedReader(new InputStreamReader(url.openStream())), z, this);
        this.f797 = new C4270();
    }
}
