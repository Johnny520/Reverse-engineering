.class public Lkg;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lr43;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Lir0;Lj63;)Lq43;
    .locals 1

    .line 1
    iget-object p0, p2, Lj63;->b:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    instance-of p2, p0, Ljava/lang/reflect/GenericArrayType;

    .line 4
    .line 5
    if-nez p2, :cond_1

    .line 6
    .line 7
    instance-of v0, p0, Ljava/lang/Class;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move-object v0, p0

    .line 12
    check-cast v0, Ljava/lang/Class;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return-object p0

    .line 22
    :cond_1
    if-eqz p2, :cond_2

    .line 23
    .line 24
    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    check-cast p0, Ljava/lang/Class;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    :goto_0
    new-instance p2, Lj63;

    .line 38
    .line 39
    invoke-direct {p2, p0}, Lj63;-><init>(Ljava/lang/reflect/Type;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, p2}, Lir0;->c(Lj63;)Lq43;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    new-instance v0, Llg;

    .line 47
    .line 48
    invoke-static {p0}, Ltl;->F(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-direct {v0, p1, p2, p0}, Llg;-><init>(Lir0;Lq43;Ljava/lang/Class;)V

    .line 53
    .line 54
    .line 55
    return-object v0
.end method
