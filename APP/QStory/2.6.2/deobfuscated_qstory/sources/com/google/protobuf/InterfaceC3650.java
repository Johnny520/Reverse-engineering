package com.google.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3650 extends InterfaceC3441 {
    /* synthetic */ List findInitializationErrors();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ Map getAllFields();

    @Override // com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    /* bridge */ /* synthetic */ default InterfaceC3440 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    /* synthetic */ InterfaceC3452 getDefaultInstanceForType();

    @Override // com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    /* synthetic */ C3662 getDescriptorForType();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ Object getField(C3656 c3656);

    /* synthetic */ String getInitializationErrorString();

    String getLeadingComments();

    ByteString getLeadingCommentsBytes();

    String getLeadingDetachedComments(int i);

    ByteString getLeadingDetachedCommentsBytes(int i);

    int getLeadingDetachedCommentsCount();

    List<String> getLeadingDetachedCommentsList();

    /* synthetic */ C3656 getOneofFieldDescriptor(C3593 c3593);

    int getPath(int i);

    int getPathCount();

    List<Integer> getPathList();

    /* synthetic */ Object getRepeatedField(C3656 c3656, int i);

    /* synthetic */ int getRepeatedFieldCount(C3656 c3656);

    int getSpan(int i);

    int getSpanCount();

    List<Integer> getSpanList();

    String getTrailingComments();

    ByteString getTrailingCommentsBytes();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ C3703 getUnknownFields();

    @Override // com.google.protobuf.InterfaceC3441
    /* synthetic */ boolean hasField(C3656 c3656);

    boolean hasLeadingComments();

    /* synthetic */ boolean hasOneof(C3593 c3593);

    boolean hasTrailingComments();

    @Override // com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
    /* synthetic */ boolean isInitialized();
}
