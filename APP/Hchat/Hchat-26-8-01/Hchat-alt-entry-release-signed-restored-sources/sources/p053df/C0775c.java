package p053df;

import ad.AbstractC0067a;
import ad.AbstractC0068b;
import ad.C0069c;
import af.C0084g;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import p005a5.C0016a;
import p067ef.C0917b;
import p067ef.C0918c;
import p067ef.C0919d;
import p332wb.AbstractC4855en;
import p382zc.EnumC6135a;
import ye.AbstractC6030a;

/* JADX INFO: renamed from: df.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0775c {

    /* JADX INFO: renamed from: d */
    public static final InterfaceC2844b f2331d = AbstractC2846d.m6274b(C0775c.class);

    /* JADX INFO: renamed from: a */
    public final C0069c f2332a;

    /* JADX INFO: renamed from: b */
    public final HashMap f2333b;

    /* JADX INFO: renamed from: c */
    public final HashMap f2334c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0775c(C0069c c0069c) {
        HashMap map = new HashMap();
        this.f2333b = map;
        this.f2334c = new HashMap();
        this.f2332a = c0069c;
        m1999b(m1998a("/android/attrs.xml"));
        m1999b(m1998a("/android/attrs_manifest.xml"));
        f2331d.mo6270x(Integer.valueOf(map.size()), "Loaded android attributes count: {}");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Document m1998a(String str) {
        try {
            InputStream resourceAsStream = C0775c.class.getResourceAsStream(str);
            try {
                if (resourceAsStream == null) {
                    throw new C0084g(str.concat(" not found in classpath"));
                }
                try {
                    Document document = (this.f2332a.f225a.contains(EnumC6135a.f24717h) ? AbstractC0067a.f222a : AbstractC0068b.f223a).newDocumentBuilder().parse(resourceAsStream);
                    resourceAsStream.close();
                    return document;
                } catch (Exception e6) {
                    throw new RuntimeException("Failed to parse xml", e6);
                }
            } finally {
            }
        } catch (Exception e7) {
            throw new C0084g("Xml load error, file: ".concat(str), e7);
        }
        throw new C0084g("Xml load error, file: ".concat(str), e7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m1999b(Document document) {
        NodeList childNodes = document.getChildNodes();
        for (int i9 = 0; i9 < childNodes.getLength(); i9++) {
            Node nodeItem = childNodes.item(i9);
            if (nodeItem.getNodeType() == 1 && nodeItem.hasChildNodes()) {
                m2000c(nodeItem.getChildNodes());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m2000c(NodeList nodeList) {
        C0016a c0016a;
        String nodeValue;
        Node namedItem;
        for (int i9 = 0; i9 < nodeList.getLength(); i9++) {
            Node nodeItem = nodeList.item(i9);
            if (nodeItem.getNodeType() == 1 && nodeItem.hasAttributes() && nodeItem.hasChildNodes()) {
                NamedNodeMap attributes = nodeItem.getAttributes();
                int i10 = 0;
                while (true) {
                    c0016a = null;
                    if (i10 >= attributes.getLength()) {
                        nodeValue = null;
                        break;
                    }
                    Node nodeItem2 = attributes.item(i10);
                    if (nodeItem2.getNodeName().equals("name")) {
                        nodeValue = nodeItem2.getNodeValue();
                        break;
                    }
                    i10++;
                }
                if (nodeValue == null || !nodeItem.getNodeName().equals("attr")) {
                    m2000c(nodeItem.getChildNodes());
                } else {
                    NodeList childNodes = nodeItem.getChildNodes();
                    for (int i11 = 0; i11 < childNodes.getLength(); i11++) {
                        Node nodeItem3 = childNodes.item(i11);
                        if (nodeItem3.getNodeType() == 1 && nodeItem3.hasAttributes()) {
                            if (c0016a == null) {
                                if (nodeItem3.getNodeName().equals("enum")) {
                                    c0016a = new C0016a(1, 2);
                                } else if (nodeItem3.getNodeName().equals("flag")) {
                                    c0016a = new C0016a(2, 2);
                                }
                                if (c0016a == null) {
                                    break;
                                } else {
                                    this.f2333b.put("android:".concat(nodeValue), c0016a);
                                }
                            }
                            NamedNodeMap attributes2 = nodeItem3.getAttributes();
                            Node namedItem2 = attributes2.getNamedItem("name");
                            if (namedItem2 != null && (namedItem = attributes2.getNamedItem("value")) != null) {
                                try {
                                    String nodeValue2 = namedItem.getNodeValue();
                                    ((LinkedHashMap) c0016a.f56i).put(Long.valueOf(nodeValue2.startsWith("0x") ? Long.parseLong(nodeValue2.substring(2), 16) : Long.parseLong(nodeValue2)), namedItem2.getNodeValue());
                                } catch (NumberFormatException e6) {
                                    f2331d.mo6266t("Failed parse manifest number", e6);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c8 A[SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2001d(C0779g c0779g) {
        int i9;
        int i10;
        String hexString;
        String str;
        String strM9263g;
        HashMap map = this.f2334c;
        map.clear();
        C0781i c0781i = c0779g.f2347e;
        C0919d c0919d = new C0919d(c0779g.f2348f, c0781i.m2015a());
        for (C0918c c0918c : c0781i.f2351a) {
            c0918c.getClass();
            if (c0918c.f2875c.equals("attr")) {
                if (c0918c.f2879g.size() > 1) {
                    int i11 = ((C0917b) c0918c.f2879g.get(0)).f2872b.f489c & 16711680;
                    if (i11 == 131072) {
                        i9 = 2;
                    } else if (i11 == 65536) {
                        i9 = 1;
                    }
                    C0016a c0016a = new C0016a(i9, 2);
                    for (int i12 = 1; i12 < c0918c.f2879g.size(); i12++) {
                        C0917b c0917b = (C0917b) c0918c.f2879g.get(i12);
                        int i13 = c0917b.f2871a;
                        if (((-65536) & i13) == 0 || (i13 & 16711680) != 0) {
                            i10 = i13;
                        } else {
                            i10 = 65535 & i13;
                            if (i10 == 0) {
                                strM9263g = null;
                            }
                            long j3 = c0917b.f2872b.f489c;
                            if (!strM9263g.startsWith("id.")) {
                                strM9263g = strM9263g.substring(3);
                            }
                            ((LinkedHashMap) c0016a.f56i).put(Long.valueOf(j3), strM9263g);
                        }
                        String str2 = (String) c0919d.f2882c.get(Integer.valueOf(i10));
                        if (str2 != null) {
                            strM9263g = str2.replace('/', '.');
                        } else {
                            String str3 = (String) AbstractC6030a.f24482a.get(Integer.valueOf(i10));
                            if (str3 != null) {
                                hexString = str3.replace('/', '.');
                                str = "android:";
                            } else {
                                hexString = Integer.toHexString(i13);
                                str = "?0x";
                            }
                            strM9263g = AbstractC4855en.m9263g(str, hexString);
                        }
                        long j32 = c0917b.f2872b.f489c;
                        if (!strM9263g.startsWith("id.")) {
                        }
                        ((LinkedHashMap) c0016a.f56i).put(Long.valueOf(j32), strM9263g);
                    }
                    map.put(c0918c.f2876d, c0016a);
                }
            }
        }
    }
}
