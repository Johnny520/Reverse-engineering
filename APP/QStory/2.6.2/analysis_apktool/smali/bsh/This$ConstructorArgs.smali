.class public Lbsh/This$ConstructorArgs;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbsh/This;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ConstructorArgs"
.end annotation


# static fields
.field public static final DEFAULT:Lbsh/This$ConstructorArgs;


# instance fields
.field arg:I

.field args:[Ljava/lang/Object;

.field public selector:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lbsh/This$ConstructorArgs;

    .line 2
    .line 3
    invoke-direct {v0}, Lbsh/This$ConstructorArgs;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbsh/This$ConstructorArgs;->DEFAULT:Lbsh/This$ConstructorArgs;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 10
    iput v0, p0, Lbsh/This$ConstructorArgs;->selector:I

    return-void
.end method

.method public constructor <init>(I[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lbsh/This$ConstructorArgs;->selector:I

    .line 5
    .line 6
    iput-object p2, p0, Lbsh/This$ConstructorArgs;->args:[Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public getBoolean()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbsh/This$ConstructorArgs;->next()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public getByte()B
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbsh/This$ConstructorArgs;->next()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->byteValue()B

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public getChar()C
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbsh/This$ConstructorArgs;->next()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Character;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Character;->charValue()C

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public getDouble()D
    .locals 2

    .line 1
    invoke-virtual {p0}, Lbsh/This$ConstructorArgs;->next()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method

.method public getFloat()F
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbsh/This$ConstructorArgs;->next()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public getInt()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbsh/This$ConstructorArgs;->next()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public getLong()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lbsh/This$ConstructorArgs;->next()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method

.method public getObject()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbsh/This$ConstructorArgs;->next()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getShort()S
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbsh/This$ConstructorArgs;->next()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->shortValue()S

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/This$ConstructorArgs;->args:[Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p0, Lbsh/This$ConstructorArgs;->arg:I

    .line 4
    .line 5
    add-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    iput v2, p0, Lbsh/This$ConstructorArgs;->arg:I

    .line 8
    .line 9
    aget-object p0, v0, v1

    .line 10
    .line 11
    return-object p0
.end method
