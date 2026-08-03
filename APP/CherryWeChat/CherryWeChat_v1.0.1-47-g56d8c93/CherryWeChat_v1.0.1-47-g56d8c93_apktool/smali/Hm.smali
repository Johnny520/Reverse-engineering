.class public final LHm;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LQm;


# static fields
.field public static final a:LHm;

.field public static final b:LEx;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, LHm;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LHm;->a:LHm;

    sget-object v3, Lmu;->o:Lmu;

    const/4 v0, 0x0

    new-array v0, v0, [LCx;

    const-string v2, "kotlinx.serialization.json.JsonPrimitive"

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

    sput-object v1, LHm;->b:LEx;

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
    .locals 2

    invoke-static {p1}, LQj;->a(LJc;)Lkz;

    move-result-object p1

    invoke-virtual {p1}, Lkz;->A0()Lkotlinx/serialization/json/b;

    move-result-object p1

    instance-of v0, p1, Lkotlinx/serialization/json/d;

    if-eqz v0, :cond_0

    check-cast p1, Lkotlinx/serialization/json/d;

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unexpected JSON element, expected JsonPrimitive, had "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, LJv;->a(Ljava/lang/Class;)LF9;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, -0x1

    invoke-static {v1, p1, v0}, Lcr;->b(ILjava/lang/CharSequence;Ljava/lang/String;)Lrm;

    move-result-object p1

    throw p1
.end method

.method public final getDescriptor()LCx;
    .locals 1

    sget-object v0, LHm;->b:LEx;

    return-object v0
.end method

.method public final serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lkotlinx/serialization/json/d;

    new-instance p1, Ljava/lang/IllegalStateException;

    const/4 p1, 0x0

    throw p1
.end method
