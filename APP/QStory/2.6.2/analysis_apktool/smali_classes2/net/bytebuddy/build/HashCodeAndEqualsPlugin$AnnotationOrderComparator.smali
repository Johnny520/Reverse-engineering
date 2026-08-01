.class public final enum Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$AnnotationOrderComparator;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AnnotationOrderComparator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$AnnotationOrderComparator;",
        ">;",
        "Ljava/util/Comparator<",
        "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$AnnotationOrderComparator;

.field public static final enum INSTANCE:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$AnnotationOrderComparator;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$AnnotationOrderComparator;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$AnnotationOrderComparator;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$AnnotationOrderComparator;->INSTANCE:Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$AnnotationOrderComparator;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$AnnotationOrderComparator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$AnnotationOrderComparator;->$VALUES:[Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$AnnotationOrderComparator;

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

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$AnnotationOrderComparator;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$AnnotationOrderComparator;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$AnnotationOrderComparator;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$AnnotationOrderComparator;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$AnnotationOrderComparator;->$VALUES:[Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$AnnotationOrderComparator;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$AnnotationOrderComparator;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$AnnotationOrderComparator;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 75
    check-cast p1, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    check-cast p2, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$AnnotationOrderComparator;->compare(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)I

    move-result p0

    return p0
.end method

.method public compare(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)I
    .locals 2

    .line 1
    invoke-interface {p1}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-class p1, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Sorted;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Lnet/bytebuddy/description/annotation/AnnotationList;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p2}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-interface {p2, p1}, Lnet/bytebuddy/description/annotation/AnnotationList;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Loadable;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-class p2, Ljava/lang/Integer;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    move p0, v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {}, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->access$100()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-interface {p0, v1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-interface {p0, p2}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    :goto_0
    if-nez p1, :cond_1

    .line 45
    .line 46
    move p1, v0

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    invoke-static {}, Lnet/bytebuddy/build/HashCodeAndEqualsPlugin;->access$100()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-interface {p1, v1}, Lnet/bytebuddy/description/annotation/AnnotationDescription;->getValue(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-interface {p1, p2}, Lnet/bytebuddy/description/annotation/AnnotationValue;->resolve(Ljava/lang/Class;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Ljava/lang/Integer;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    :goto_1
    if-le p0, p1, :cond_2

    .line 67
    .line 68
    const/4 p0, -0x1

    .line 69
    return p0

    .line 70
    :cond_2
    if-ge p0, p1, :cond_3

    .line 71
    .line 72
    const/4 p0, 0x1

    .line 73
    return p0

    .line 74
    :cond_3
    return v0
.end method
