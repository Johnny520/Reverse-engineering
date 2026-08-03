package org.simpleframework.xml.stream;

import Yue.InterfaceC3453;
import Yue.InterfaceC3788;
import Yue.InterfaceC5801;
import Yue.InterfaceC7574;
import Yue.InterfaceC8543;
import Yue.InterfaceC8549;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
class StreamReader implements EventReader {
    private EventNode peek;
    private InterfaceC8549 reader;

    public static class End extends EventToken {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private End() {
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public boolean isEnd() {
            return true;
        }
    }

    public static class Entry extends EventAttribute {
        private final InterfaceC3453 entry;

        public Entry(InterfaceC3453 interfaceC3453) {
            this.entry = interfaceC3453;
        }

        @Override // org.simpleframework.xml.stream.Attribute
        public String getName() {
            return this.entry.getName().m3294();
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public String getPrefix() {
            return this.entry.getName().m21588();
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public String getReference() {
            return this.entry.getName().m3295();
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public Object getSource() {
            return this.entry;
        }

        @Override // org.simpleframework.xml.stream.Attribute
        public String getValue() {
            return this.entry.getValue();
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public boolean isReserved() {
            return false;
        }
    }

    public static class Start extends EventElement {
        private final InterfaceC7574 element;
        private final InterfaceC5801 location;

        public Start(InterfaceC8543 interfaceC8543) {
            this.element = interfaceC8543.mo9162();
            this.location = interfaceC8543.mo9151();
        }

        public Iterator<InterfaceC3453> getAttributes() {
            return this.element.getAttributes();
        }

        @Override // org.simpleframework.xml.stream.EventElement, org.simpleframework.xml.stream.EventNode
        public int getLine() {
            return this.location.mo9160();
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public String getName() {
            return this.element.getName().m3294();
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public String getPrefix() {
            return this.element.getName().m21588();
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public String getReference() {
            return this.element.getName().m3295();
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public Object getSource() {
            return this.element;
        }
    }

    public static class Text extends EventToken {
        private final InterfaceC3788 text;

        public Text(InterfaceC8543 interfaceC8543) {
            this.text = interfaceC8543.mo9161();
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public Object getSource() {
            return this.text;
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public String getValue() {
            return this.text.getData();
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public boolean isText() {
            return true;
        }
    }

    public StreamReader(InterfaceC8549 interfaceC8549) {
        this.reader = interfaceC8549;
    }

    private Entry attribute(InterfaceC3453 interfaceC3453) {
        return new Entry(interfaceC3453);
    }

    private Start build(Start start) {
        Iterator<InterfaceC3453> attributes = start.getAttributes();
        while (attributes.hasNext()) {
            Entry entryAttribute = attribute(attributes.next());
            if (!entryAttribute.isReserved()) {
                start.add(entryAttribute);
            }
        }
        return start;
    }

    private End end() {
        return new End();
    }

    private EventNode read() throws Exception {
        InterfaceC8543 interfaceC8543Mo14125 = this.reader.mo14125();
        if (interfaceC8543Mo14125.mo9165()) {
            return null;
        }
        return interfaceC8543Mo14125.mo9149() ? start(interfaceC8543Mo14125) : interfaceC8543Mo14125.mo9146() ? text(interfaceC8543Mo14125) : interfaceC8543Mo14125.mo9148() ? end() : read();
    }

    private Start start(InterfaceC8543 interfaceC8543) {
        Start start = new Start(interfaceC8543);
        return start.isEmpty() ? build(start) : start;
    }

    private Text text(InterfaceC8543 interfaceC8543) {
        return new Text(interfaceC8543);
    }

    @Override // org.simpleframework.xml.stream.EventReader
    public EventNode next() throws Exception {
        EventNode eventNode = this.peek;
        if (eventNode == null) {
            return read();
        }
        this.peek = null;
        return eventNode;
    }

    @Override // org.simpleframework.xml.stream.EventReader
    public EventNode peek() throws Exception {
        if (this.peek == null) {
            this.peek = next();
        }
        return this.peek;
    }
}
