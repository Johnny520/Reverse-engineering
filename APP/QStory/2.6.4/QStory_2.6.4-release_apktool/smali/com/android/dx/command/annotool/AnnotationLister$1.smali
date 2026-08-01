.class Lcom/android/dx/command/annotool/AnnotationLister$1;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/android/dx/cf/direct/ClassPathOpener$Consumer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/dx/command/annotool/AnnotationLister;->process()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/android/dx/command/annotool/AnnotationLister;


# direct methods
.method public constructor <init>(Lcom/android/dx/command/annotool/AnnotationLister;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/android/dx/command/annotool/AnnotationLister$1;->this$0:Lcom/android/dx/command/annotool/AnnotationLister;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onException(Ljava/lang/Exception;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/RuntimeException;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public onProcessArchiveStart(Ljava/io/File;)V
    .locals 0

    .line 1
    return-void
.end method

.method public processFileBytes(Ljava/lang/String;J[B)Z
    .locals 3

    .line 1
    const-string p2, ".class"

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 p3, 0x1

    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    return p3

    .line 11
    :cond_0
    new-instance p2, Lcom/android/dx/util/ByteArray;

    .line 12
    .line 13
    invoke-direct {p2, p4}, Lcom/android/dx/util/ByteArray;-><init>([B)V

    .line 14
    .line 15
    .line 16
    new-instance p4, Lcom/android/dx/cf/direct/DirectClassFile;

    .line 17
    .line 18
    invoke-direct {p4, p2, p1, p3}, Lcom/android/dx/cf/direct/DirectClassFile;-><init>(Lcom/android/dx/util/ByteArray;Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    sget-object p1, Lcom/android/dx/cf/direct/StdAttributeFactory;->THE_ONE:Lcom/android/dx/cf/direct/StdAttributeFactory;

    .line 22
    .line 23
    invoke-virtual {p4, p1}, Lcom/android/dx/cf/direct/DirectClassFile;->setAttributeFactory(Lcom/android/dx/cf/direct/AttributeFactory;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p4}, Lcom/android/dx/cf/direct/DirectClassFile;->getAttributes()Lcom/android/dx/cf/iface/AttributeList;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p4}, Lcom/android/dx/cf/direct/DirectClassFile;->getThisClass()Lcom/android/dx/rop/cst/CstType;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstType;->getClassType()Lcom/android/dx/rop/type/Type;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p2}, Lcom/android/dx/rop/type/Type;->getClassName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    const-string v0, "package-info"

    .line 43
    .line 44
    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    const-string v1, "RuntimeVisibleAnnotations"

    .line 49
    .line 50
    const-string v2, "RuntimeInvisibleAnnotations"

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    invoke-interface {p1, v2}, Lcom/android/dx/cf/iface/AttributeList;->findFirst(Ljava/lang/String;)Lcom/android/dx/cf/iface/Attribute;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    :goto_0
    if-eqz p2, :cond_1

    .line 59
    .line 60
    move-object v0, p2

    .line 61
    check-cast v0, Lcom/android/dx/cf/attrib/BaseAnnotations;

    .line 62
    .line 63
    iget-object v2, p0, Lcom/android/dx/command/annotool/AnnotationLister$1;->this$0:Lcom/android/dx/command/annotool/AnnotationLister;

    .line 64
    .line 65
    invoke-static {v2, p4, v0}, Lcom/android/dx/command/annotool/AnnotationLister;->access$000(Lcom/android/dx/command/annotool/AnnotationLister;Lcom/android/dx/cf/direct/DirectClassFile;Lcom/android/dx/cf/attrib/BaseAnnotations;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {p1, p2}, Lcom/android/dx/cf/iface/AttributeList;->findNext(Lcom/android/dx/cf/iface/Attribute;)Lcom/android/dx/cf/iface/Attribute;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    goto :goto_0

    .line 73
    :cond_1
    invoke-interface {p1, v1}, Lcom/android/dx/cf/iface/AttributeList;->findFirst(Ljava/lang/String;)Lcom/android/dx/cf/iface/Attribute;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    :goto_1
    if-eqz p2, :cond_6

    .line 78
    .line 79
    move-object v0, p2

    .line 80
    check-cast v0, Lcom/android/dx/cf/attrib/BaseAnnotations;

    .line 81
    .line 82
    iget-object v1, p0, Lcom/android/dx/command/annotool/AnnotationLister$1;->this$0:Lcom/android/dx/command/annotool/AnnotationLister;

    .line 83
    .line 84
    invoke-static {v1, p4, v0}, Lcom/android/dx/command/annotool/AnnotationLister;->access$000(Lcom/android/dx/command/annotool/AnnotationLister;Lcom/android/dx/cf/direct/DirectClassFile;Lcom/android/dx/cf/attrib/BaseAnnotations;)V

    .line 85
    .line 86
    .line 87
    invoke-interface {p1, p2}, Lcom/android/dx/cf/iface/AttributeList;->findNext(Lcom/android/dx/cf/iface/Attribute;)Lcom/android/dx/cf/iface/Attribute;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    goto :goto_1

    .line 92
    :cond_2
    iget-object v0, p0, Lcom/android/dx/command/annotool/AnnotationLister$1;->this$0:Lcom/android/dx/command/annotool/AnnotationLister;

    .line 93
    .line 94
    invoke-static {v0, p2}, Lcom/android/dx/command/annotool/AnnotationLister;->access$100(Lcom/android/dx/command/annotool/AnnotationLister;Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_5

    .line 99
    .line 100
    iget-object v0, p0, Lcom/android/dx/command/annotool/AnnotationLister$1;->this$0:Lcom/android/dx/command/annotool/AnnotationLister;

    .line 101
    .line 102
    invoke-static {v0, p2}, Lcom/android/dx/command/annotool/AnnotationLister;->access$200(Lcom/android/dx/command/annotool/AnnotationLister;Ljava/lang/String;)Z

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    if-eqz p2, :cond_3

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_3
    invoke-interface {p1, v2}, Lcom/android/dx/cf/iface/AttributeList;->findFirst(Ljava/lang/String;)Lcom/android/dx/cf/iface/Attribute;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    :goto_2
    if-eqz p2, :cond_4

    .line 114
    .line 115
    move-object v0, p2

    .line 116
    check-cast v0, Lcom/android/dx/cf/attrib/BaseAnnotations;

    .line 117
    .line 118
    iget-object v2, p0, Lcom/android/dx/command/annotool/AnnotationLister$1;->this$0:Lcom/android/dx/command/annotool/AnnotationLister;

    .line 119
    .line 120
    invoke-static {v2, p4, v0}, Lcom/android/dx/command/annotool/AnnotationLister;->access$400(Lcom/android/dx/command/annotool/AnnotationLister;Lcom/android/dx/cf/direct/DirectClassFile;Lcom/android/dx/cf/attrib/BaseAnnotations;)V

    .line 121
    .line 122
    .line 123
    invoke-interface {p1, p2}, Lcom/android/dx/cf/iface/AttributeList;->findNext(Lcom/android/dx/cf/iface/Attribute;)Lcom/android/dx/cf/iface/Attribute;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    goto :goto_2

    .line 128
    :cond_4
    invoke-interface {p1, v1}, Lcom/android/dx/cf/iface/AttributeList;->findFirst(Ljava/lang/String;)Lcom/android/dx/cf/iface/Attribute;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    :goto_3
    if-eqz p2, :cond_6

    .line 133
    .line 134
    move-object v0, p2

    .line 135
    check-cast v0, Lcom/android/dx/cf/attrib/BaseAnnotations;

    .line 136
    .line 137
    iget-object v1, p0, Lcom/android/dx/command/annotool/AnnotationLister$1;->this$0:Lcom/android/dx/command/annotool/AnnotationLister;

    .line 138
    .line 139
    invoke-static {v1, p4, v0}, Lcom/android/dx/command/annotool/AnnotationLister;->access$400(Lcom/android/dx/command/annotool/AnnotationLister;Lcom/android/dx/cf/direct/DirectClassFile;Lcom/android/dx/cf/attrib/BaseAnnotations;)V

    .line 140
    .line 141
    .line 142
    invoke-interface {p1, p2}, Lcom/android/dx/cf/iface/AttributeList;->findNext(Lcom/android/dx/cf/iface/Attribute;)Lcom/android/dx/cf/iface/Attribute;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    goto :goto_3

    .line 147
    :cond_5
    :goto_4
    iget-object p0, p0, Lcom/android/dx/command/annotool/AnnotationLister$1;->this$0:Lcom/android/dx/command/annotool/AnnotationLister;

    .line 148
    .line 149
    invoke-static {p0, p4}, Lcom/android/dx/command/annotool/AnnotationLister;->access$300(Lcom/android/dx/command/annotool/AnnotationLister;Lcom/android/dx/cf/direct/DirectClassFile;)V

    .line 150
    .line 151
    .line 152
    :cond_6
    return p3
.end method
