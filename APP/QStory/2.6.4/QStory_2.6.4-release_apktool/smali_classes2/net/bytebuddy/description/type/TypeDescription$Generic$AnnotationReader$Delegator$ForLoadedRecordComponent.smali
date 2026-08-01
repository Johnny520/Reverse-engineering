.class public Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedRecordComponent;
.super Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$Delegator;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$Delegator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForLoadedRecordComponent"
.end annotation


# instance fields
.field private final recordComponent:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$Delegator;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedRecordComponent;->recordComponent:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public resolve()Ljava/lang/reflect/AnnotatedElement;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent;->RECORD_COMPONENT:Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent$RecordComponent;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$Delegator$ForLoadedRecordComponent;->recordComponent:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent$RecordComponent;->getAnnotatedType(Ljava/lang/Object;)Ljava/lang/reflect/AnnotatedElement;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
