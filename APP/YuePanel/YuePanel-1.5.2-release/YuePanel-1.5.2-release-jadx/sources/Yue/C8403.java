package Yue;

import Yue.C4483;
import Yue.C7293;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Stack;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathFactoryConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: renamed from: Yue.ۥۢۥ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C8403 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f25093 = "jsoupSource";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f25094 = "jsoupContextSource";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String f25095 = "jsoupContextNode";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String f25096 = "javax.xml.xpath.XPathFactory:jsoup";

    /* JADX INFO: renamed from: ۥ */
    public DocumentBuilderFactory f3467;

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean f3468 = true;

    /* JADX INFO: renamed from: Yue.ۥۢۥ۠ۥ$ۥ */
    public static class C1519 implements InterfaceC6387 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final String f25097 = "xmlns";

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final String f25098 = "xmlns:";

        /* JADX INFO: renamed from: ۥ */
        public final Document f3469;

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean f3470 = true;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Stack<HashMap<String, String>> f25099;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Node f25100;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public C4483.C0414.EnumC4484 f25101;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final C4605 f25102;

        public C1519(Document document) {
            Stack<HashMap<String, String>> stack = new Stack<>();
            this.f25099 = stack;
            this.f25101 = C4483.C0414.EnumC4484.xml;
            this.f3469 = document;
            stack.push(new HashMap<>());
            this.f25100 = document;
            C4605 c4605 = (C4605) document.getUserData(C8403.f25094);
            this.f25102 = c4605;
            C4483 c4483M19918 = c4605.m19918();
            if (this.f3470 && c4483M19918 != null && (c4483M19918.m13004().m21003() instanceof C5321)) {
                stack.peek().put("", C6617.f16980);
            }
        }

        @Override // Yue.InterfaceC6387
        /* JADX INFO: renamed from: ۥ */
        public void mo891(AbstractC6381 abstractC6381, int i) {
            this.f25099.push(new HashMap<>(this.f25099.peek()));
            if (!(abstractC6381 instanceof C4605)) {
                if (abstractC6381 instanceof C7755) {
                    C7755 c7755 = (C7755) abstractC6381;
                    m28007(this.f3469.createTextNode(c7755.m24631()), c7755);
                    return;
                } else if (abstractC6381 instanceof C3929) {
                    C3929 c3929 = (C3929) abstractC6381;
                    m28007(this.f3469.createComment(c3929.m11195()), c3929);
                    return;
                } else {
                    if (abstractC6381 instanceof C4299) {
                        C4299 c4299 = (C4299) abstractC6381;
                        m28007(this.f3469.createTextNode(c4299.m12417()), c4299);
                        return;
                    }
                    return;
                }
            }
            C4605 c4605 = (C4605) abstractC6381;
            String str = this.f3470 ? this.f25099.peek().get(m28009(c4605)) : null;
            String strM13816 = c4605.m13816();
            if (str == null) {
                try {
                    if (strM13816.contains(":")) {
                        str = "";
                    }
                } catch (DOMException unused) {
                    m28007(this.f3469.createTextNode("<" + strM13816 + ">"), c4605);
                    return;
                }
            }
            Element elementCreateElementNS = this.f3469.createElementNS(str, strM13816);
            m28008(c4605, elementCreateElementNS);
            m28007(elementCreateElementNS, c4605);
            if (c4605 == this.f25102) {
                this.f3469.setUserData(C8403.f25095, elementCreateElementNS, null);
            }
            this.f25100 = elementCreateElementNS;
        }

        @Override // Yue.InterfaceC6387
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo892(AbstractC6381 abstractC6381, int i) {
            if ((abstractC6381 instanceof C4605) && (this.f25100.getParentNode() instanceof Element)) {
                this.f25100 = this.f25100.getParentNode();
            }
            this.f25099.pop();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final void m28007(Node node, AbstractC6381 abstractC6381) {
            node.setUserData(C8403.f25093, abstractC6381, null);
            this.f25100.appendChild(node);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final void m28008(AbstractC6381 abstractC6381, Element element) {
            for (C3454 c3454 : abstractC6381.mo13685()) {
                String strM9127 = C3454.m9127(c3454.getKey(), this.f25101);
                if (strM9127 != null) {
                    element.setAttribute(strM9127, c3454.getValue());
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final String m28009(C4605 c4605) {
            Iterator<C3454> it = c4605.mo13685().iterator();
            while (true) {
                String strSubstring = "";
                if (!it.hasNext()) {
                    break;
                }
                C3454 next = it.next();
                String key = next.getKey();
                if (!key.equals("xmlns")) {
                    if (key.startsWith(f25098)) {
                        strSubstring = key.substring(6);
                    }
                }
                this.f25099.peek().put(strSubstring, next.getValue());
            }
            int iIndexOf = c4605.m13816().indexOf(58);
            return iIndexOf > 0 ? c4605.m13816().substring(0, iIndexOf) : "";
        }
    }

    public C8403() {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        this.f3467 = documentBuilderFactoryNewInstance;
        documentBuilderFactoryNewInstance.setNamespaceAware(true);
    }

    /* JADX INFO: renamed from: ۥ */
    public static HashMap<String, String> m4380() {
        return m27992("html");
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static HashMap<String, String> m4381() {
        return m27992(C8542.f3549);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static String m27990(Document document, Map<String, String> map) {
        try {
            DOMSource dOMSource = new DOMSource(document);
            StringWriter stringWriter = new StringWriter();
            StreamResult streamResult = new StreamResult(stringWriter);
            Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
            if (map != null) {
                transformerNewTransformer.setOutputProperties(m27993(map));
            }
            if (document.getDoctype() != null) {
                DocumentType doctype = document.getDoctype();
                if (!C7615.m23815(doctype.getPublicId())) {
                    transformerNewTransformer.setOutputProperty("doctype-public", doctype.getPublicId());
                }
                if (!C7615.m23815(doctype.getSystemId())) {
                    transformerNewTransformer.setOutputProperty("doctype-system", doctype.getSystemId());
                } else if (doctype.getName().equalsIgnoreCase("html") && C7615.m23815(doctype.getPublicId()) && C7615.m23815(doctype.getSystemId())) {
                    transformerNewTransformer.setOutputProperty("doctype-system", "about:legacy-compat");
                }
            }
            transformerNewTransformer.transform(dOMSource, streamResult);
            return stringWriter.toString();
        } catch (TransformerException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static Document m27991(C4483 c4483) {
        return new C8403().m27998(c4483);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static HashMap<String, String> m27992(String str) {
        HashMap<String, String> map = new HashMap<>();
        map.put("method", str);
        return map;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static Properties m27993(Map<String, String> map) {
        Properties properties = new Properties();
        properties.putAll(map);
        return properties;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public String m27994(Document document) {
        return m27990(document, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Node m27995(Document document) {
        return (Node) document.getUserData(f25095);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m27996(C4483 c4483, Document document) {
        m27997(c4483, document);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m27997(C4605 c4605, Document document) {
        C1519 c1519 = new C1519(document);
        c1519.f3470 = this.f3468;
        C4483 c4483M19918 = c4605.m19918();
        if (c4483M19918 != null) {
            if (!C7615.m23815(c4483M19918.m13000())) {
                document.setDocumentURI(c4483M19918.m13000());
            }
            c1519.f25101 = c4483M19918.m13001().m13028();
        }
        if (c4605 instanceof C4483) {
            c4605 = c4605.m13744();
        }
        C6385.m19940(c1519, c4605);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public Document m27998(C4483 c4483) {
        return m27999(c4483);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public Document m27999(C4605 c4605) {
        C8159.m26910(c4605);
        try {
            DocumentBuilder documentBuilderNewDocumentBuilder = this.f3467.newDocumentBuilder();
            DOMImplementation dOMImplementation = documentBuilderNewDocumentBuilder.getDOMImplementation();
            Document documentNewDocument = documentBuilderNewDocumentBuilder.newDocument();
            C4483 c4483M19918 = c4605.m19918();
            C4486 c4486M12994 = c4483M19918 != null ? c4483M19918.m12994() : null;
            if (c4486M12994 != null) {
                try {
                    documentNewDocument.appendChild(dOMImplementation.createDocumentType(c4486M12994.m13051(), c4486M12994.m13052(), c4486M12994.m13054()));
                } catch (DOMException unused) {
                }
            }
            documentNewDocument.setXmlStandalone(true);
            documentNewDocument.setUserData(f25094, c4605 instanceof C4483 ? c4605.m13744() : c4605, null);
            if (c4483M19918 != null) {
                c4605 = c4483M19918;
            }
            m27997(c4605, documentNewDocument);
            return documentNewDocument;
        } catch (ParserConfigurationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public C8403 m28000(boolean z) {
        this.f3468 = z;
        this.f3467.setNamespaceAware(z);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean m28001() {
        return this.f3468;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public NodeList m28002(String str, Document document) {
        return m28003(str, document);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public NodeList m28003(String str, Node node) {
        C8159.m26909(str, "xpath");
        C8159.m26912(node, "contextNode");
        try {
            NodeList nodeList = (NodeList) (System.getProperty(f25096) != null ? XPathFactory.newInstance("jsoup") : XPathFactory.newInstance()).newXPath().compile(str).evaluate(node, XPathConstants.NODESET);
            C8159.m26910(nodeList);
            return nodeList;
        } catch (XPathExpressionException e) {
            e = e;
            throw new C7293.C1224(e, "Could not evaluate XPath query [%s]: %s", str, e.getMessage());
        } catch (XPathFactoryConfigurationException e2) {
            e = e2;
            throw new C7293.C1224(e, "Could not evaluate XPath query [%s]: %s", str, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public <T extends AbstractC6381> List<T> m28004(NodeList nodeList, Class<T> cls) {
        C8159.m26910(nodeList);
        C8159.m26910(cls);
        ArrayList arrayList = new ArrayList(nodeList.getLength());
        for (int i = 0; i < nodeList.getLength(); i++) {
            Object userData = nodeList.item(i).getUserData(f25093);
            if (cls.isInstance(userData)) {
                arrayList.add(cls.cast(userData));
            }
        }
        return arrayList;
    }
}
