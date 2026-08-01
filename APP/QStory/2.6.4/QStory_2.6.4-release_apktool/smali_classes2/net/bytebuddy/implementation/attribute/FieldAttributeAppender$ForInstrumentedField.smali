.class public final enum Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$ForInstrumentedField;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender;
.implements Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ForInstrumentedField"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$ForInstrumentedField;",
        ">;",
        "Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender;",
        "Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$Factory;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$ForInstrumentedField;

.field public static final enum INSTANCE:Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$ForInstrumentedField;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$ForInstrumentedField;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$ForInstrumentedField;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$ForInstrumentedField;->INSTANCE:Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$ForInstrumentedField;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$ForInstrumentedField;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$ForInstrumentedField;->$VALUES:[Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$ForInstrumentedField;

    .line 16
    .line 17
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$ForInstrumentedField;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$ForInstrumentedField;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$ForInstrumentedField;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$ForInstrumentedField;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$ForInstrumentedField;->$VALUES:[Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$ForInstrumentedField;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$ForInstrumentedField;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender$ForInstrumentedField;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/FieldVisitor;Lnet/bytebuddy/description/field/FieldDescription;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;)V
    .locals 1

    .line 1
    new-instance p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Default;

    .line 2
    .line 3
    new-instance v0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Target$OnField;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Target$OnField;-><init>(Lnet/bytebuddy/jar/asm/FieldVisitor;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Default;-><init>(Lnet/bytebuddy/implementation/attribute/AnnotationAppender$Target;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p2}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p0, p3}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender$ForTypeAnnotations;->ofFieldType(Lnet/bytebuddy/implementation/attribute/AnnotationAppender;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;)Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p1, p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Lnet/bytebuddy/implementation/attribute/AnnotationAppender;

    .line 24
    .line 25
    invoke-interface {p2}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_0

    .line 38
    .line 39
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    check-cast p2, Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 44
    .line 45
    invoke-interface {p0, p2, p3}, Lnet/bytebuddy/implementation/attribute/AnnotationAppender;->append(Lnet/bytebuddy/description/annotation/AnnotationDescription;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;)Lnet/bytebuddy/implementation/attribute/AnnotationAppender;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    return-void
.end method

.method public make(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/attribute/FieldAttributeAppender;
    .locals 0

    .line 1
    return-object p0
.end method
