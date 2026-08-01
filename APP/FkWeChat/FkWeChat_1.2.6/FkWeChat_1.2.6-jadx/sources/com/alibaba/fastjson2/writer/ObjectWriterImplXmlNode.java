package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.C1565a;
import com.alibaba.fastjson2.JSONWriter;
import java.io.StringWriter;
import java.lang.reflect.Type;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Node;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriterImplXmlNode implements ObjectWriter {
    static final ObjectWriterImplXmlNode INSTANCE = new ObjectWriterImplXmlNode();
    static final TransformerFactory TRANSFORMER_FACTORY;

    static {
        try {
            TRANSFORMER_FACTORY = TransformerFactory.newInstance();
        } catch (Exception e10) {
            C1565a.m6255a("init xml TransformerFactory error", e10);
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        try {
            Transformer transformerNewTransformer = TRANSFORMER_FACTORY.newTransformer();
            DOMSource dOMSource = new DOMSource((Node) obj);
            StringWriter stringWriter = new StringWriter();
            transformerNewTransformer.transform(dOMSource, new StreamResult(stringWriter));
            jSONWriter.writeString(stringWriter.toString());
        } catch (Exception e10) {
            C1565a.m6255a("write xml node error", e10);
        }
    }
}
