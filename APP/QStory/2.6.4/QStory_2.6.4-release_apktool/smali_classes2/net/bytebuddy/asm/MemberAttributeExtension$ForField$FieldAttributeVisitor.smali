.class Lnet/bytebuddy/asm/MemberAttributeExtension$ForField$FieldAttributeVisitor;
.super Lnet/bytebuddy/jar/asm/FieldVisitor;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberAttributeExtension$ForField;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FieldAttributeVisitor"
.end annotation


# instance fields
.field private final annotationValueFilter:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;

.field private final fieldAttributeAppender:Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender;

.field private final fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;


# direct methods
.method private constructor <init>(Lnet/bytebuddy/jar/asm/FieldVisitor;Lnet/bytebuddy/description/field/FieldDescription;Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;)V
    .locals 1

    .line 1
    sget v0, Lnet/bytebuddy/utility/OpenedClassReader;->ASM_API:I

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lnet/bytebuddy/jar/asm/FieldVisitor;-><init>(ILnet/bytebuddy/jar/asm/FieldVisitor;)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/MemberAttributeExtension$ForField$FieldAttributeVisitor;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/asm/MemberAttributeExtension$ForField$FieldAttributeVisitor;->fieldAttributeAppender:Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/asm/MemberAttributeExtension$ForField$FieldAttributeVisitor;->annotationValueFilter:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;

    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Lnet/bytebuddy/jar/asm/FieldVisitor;Lnet/bytebuddy/description/field/FieldDescription;Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;Lnet/bytebuddy/asm/MemberAttributeExtension$1;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1, p2, p3, p4}, Lnet/bytebuddy/asm/MemberAttributeExtension$ForField$FieldAttributeVisitor;-><init>(Lnet/bytebuddy/jar/asm/FieldVisitor;Lnet/bytebuddy/description/field/FieldDescription;Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;)V

    return-void
.end method


# virtual methods
.method public visitEnd()V
    .locals 4

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/MemberAttributeExtension$ForField$FieldAttributeVisitor;->fieldAttributeAppender:Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/jar/asm/FieldVisitor;->fv:Lnet/bytebuddy/jar/asm/FieldVisitor;

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/asm/MemberAttributeExtension$ForField$FieldAttributeVisitor;->fieldDescription:Lnet/bytebuddy/description/field/FieldDescription;

    .line 6
    .line 7
    iget-object v3, p0, Lnet/bytebuddy/asm/MemberAttributeExtension$ForField$FieldAttributeVisitor;->annotationValueFilter:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;

    .line 8
    .line 9
    invoke-interface {v0, v1, v2, v3}, Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender;->apply(Lnet/bytebuddy/jar/asm/FieldVisitor;Lnet/bytebuddy/description/field/FieldDescription;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;)V

    .line 10
    .line 11
    .line 12
    invoke-super {p0}, Lnet/bytebuddy/jar/asm/FieldVisitor;->visitEnd()V

    .line 13
    .line 14
    .line 15
    return-void
.end method
