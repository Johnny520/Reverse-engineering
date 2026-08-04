package org.simpleframework.xml.stream;

import java.util.Iterator;
import yyds.C0188;
import yyds.InterfaceC1170;
import yyds.InterfaceC1748;
import yyds.InterfaceC1972;
import yyds.InterfaceC2080;
import yyds.InterfaceC2625;
import yyds.InterfaceC2783;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
class StreamReader implements EventReader {
    private EventNode peek;
    private InterfaceC1748 reader;

    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    public static class End extends EventToken {
        private End() {
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public boolean isEnd() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    public static class Entry extends EventAttribute {
        private final InterfaceC1972 entry;

        public Entry(InterfaceC1972 interfaceC1972) {
        }

        @Override // org.simpleframework.xml.stream.Attribute
        public String getName() {
            throw null;
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public String getPrefix() {
            throw null;
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public String getReference() {
            throw null;
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public Object getSource() {
            return null;
        }

        @Override // org.simpleframework.xml.stream.Attribute
        public String getValue() {
            throw null;
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public boolean isReserved() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    public static class Start extends EventElement {
        private final InterfaceC2625 element;
        private final InterfaceC2783 location;

        public Start(InterfaceC2080 interfaceC2080) {
            interfaceC2080.m3984();
            interfaceC2080.m3985();
        }

        public Iterator<InterfaceC1972> getAttributes() {
            throw null;
        }

        @Override // org.simpleframework.xml.stream.EventElement, org.simpleframework.xml.stream.EventNode
        public int getLine() {
            throw null;
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public String getName() {
            throw null;
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public String getPrefix() {
            throw null;
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public String getReference() {
            throw null;
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public Object getSource() {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
    public static class Text extends EventToken {
        private final InterfaceC1170 text;

        public Text(InterfaceC2080 interfaceC2080) {
            interfaceC2080.m3983();
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public Object getSource() {
            return null;
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public String getValue() {
            throw null;
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public boolean isText() {
            return true;
        }
    }

    public StreamReader(InterfaceC1748 interfaceC1748) {
    }

    private Entry attribute(InterfaceC1972 interfaceC1972) {
        return new Entry(interfaceC1972);
    }

    private Start build(Start start) {
        Iterator<InterfaceC1972> attributes = start.getAttributes();
        while (attributes.hasNext()) {
            if (attributes.next() != null) {
                C0188.m794();
                return null;
            }
            Entry entryAttribute = attribute(null);
            if (!entryAttribute.isReserved()) {
                start.add(entryAttribute);
            }
        }
        return start;
    }

    private End end() {
        return new End();
    }

    private EventNode read() {
        throw null;
    }

    private Start start(InterfaceC2080 interfaceC2080) {
        Start start = new Start(interfaceC2080);
        return start.isEmpty() ? build(start) : start;
    }

    private Text text(InterfaceC2080 interfaceC2080) {
        return new Text(interfaceC2080);
    }

    @Override // org.simpleframework.xml.stream.EventReader
    public EventNode next() {
        EventNode eventNode = this.peek;
        if (eventNode == null) {
            return read();
        }
        this.peek = null;
        return eventNode;
    }

    @Override // org.simpleframework.xml.stream.EventReader
    public EventNode peek() {
        EventNode eventNode = this.peek;
        if (eventNode != null) {
            return eventNode;
        }
        EventNode next = next();
        this.peek = next;
        return next;
    }
}
