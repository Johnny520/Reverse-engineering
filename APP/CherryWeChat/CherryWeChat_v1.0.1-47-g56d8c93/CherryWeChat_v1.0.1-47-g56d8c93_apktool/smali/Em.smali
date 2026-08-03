.class public final LEm;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LQm;


# static fields
.field public static final a:LEm;

.field public static final b:LEx;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, LEm;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LEm;->a:LEm;

    sget-object v3, LFx;->h:LFx;

    const/4 v0, 0x0

    new-array v0, v0, [LCx;

    const-string v2, "kotlinx.serialization.json.JsonNull"

    invoke-static {v2}, Ltz;->T(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, LCz;->g:LCz;

    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v6, LG9;

    invoke-direct {v6, v2}, LG9;-><init>(Ljava/lang/String;)V

    new-instance v1, LEx;

    iget-object v4, v6, LG9;->b:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-static {v0}, LP4;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct/range {v1 .. v6}, LEx;-><init>(Ljava/lang/String;LfG;ILjava/util/List;LG9;)V

    sput-object v1, LEm;->b:LEx;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "For StructureKind.CLASS please use \'buildClassSerialDescriptor\' instead"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Blank serial names are prohibited"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final deserialize(LJc;)Ljava/lang/Object;
    .locals 1

    invoke-static {p1}, LQj;->a(LJc;)Lkz;

    invoke-interface {p1}, LJc;->f()Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Lkotlinx/serialization/json/JsonNull;->INSTANCE:Lkotlinx/serialization/json/JsonNull;

    return-object p1

    :cond_0
    new-instance p1, Lrm;

    const-string v0, "Expected \'null\' literal"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getDescriptor()LCx;
    .locals 1

    sget-object v0, LEm;->b:LEx;

    return-object v0
.end method

.method public final serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lkotlinx/serialization/json/JsonNull;

    new-instance p1, Ljava/lang/IllegalStateException;

    const/4 p1, 0x0

    throw p1
.end method
