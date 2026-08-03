.class public abstract enum Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "ForBeanProperty"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty;",
        ">;",
        "Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty;

.field public static final enum CAPITALIZED:Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty;

.field public static final enum INSTANCE:Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty$1;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty$1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty;->INSTANCE:Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty;

    new-instance v1, Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty$2;

    const-string v3, "CAPITALIZED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty$2;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty;->CAPITALIZED:Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty;

    const/4 v3, 0x2

    new-array v3, v3, [Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty;->$VALUES:[Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty;

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

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILnet/bytebuddy/implementation/FieldAccessor$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty;
    .locals 1

    const-class v0, Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty;

    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty;
    .locals 1

    sget-object v0, Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty;->$VALUES:[Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty;

    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty;

    return-object v0
.end method


# virtual methods
.method public abstract resolve(C)C
.end method

.method public resolve(Lnet/bytebuddy/description/method/MethodDescription;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-interface {p1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    move-result-object v0

    .line 2
    const-string v1, "get"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "set"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    const-string v1, "is"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x2

    goto :goto_1

    .line 4
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " does not follow Java bean naming conventions"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    const/4 v1, 0x3

    .line 5
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_3

    .line 7
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-virtual {p0, v1}, Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty;->resolve(C)C

    move-result v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 8
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " does not specify a bean name"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
