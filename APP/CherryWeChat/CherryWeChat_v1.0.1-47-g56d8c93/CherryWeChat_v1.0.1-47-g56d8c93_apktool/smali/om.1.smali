.class public final Lom;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LQm;


# static fields
.field public static final a:Lom;

.field public static final b:Lnm;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lom;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lom;->a:Lom;

    sget-object v0, Lnm;->b:Lnm;

    sput-object v0, Lom;->b:Lnm;

    return-void
.end method


# virtual methods
.method public final deserialize(LJc;)Ljava/lang/Object;
    .locals 3

    invoke-static {p1}, LQj;->a(LJc;)Lkz;

    new-instance v0, Lkotlinx/serialization/json/a;

    sget-object v1, Lvm;->a:Lvm;

    new-instance v2, LG4;

    invoke-direct {v2, v1}, LG4;-><init>(LQm;)V

    invoke-virtual {v2, p1}, Lt;->d(LJc;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-direct {v0, p1}, Lkotlinx/serialization/json/a;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public final getDescriptor()LCx;
    .locals 1

    sget-object v0, Lom;->b:Lnm;

    return-object v0
.end method

.method public final serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lkotlinx/serialization/json/a;

    new-instance p1, Ljava/lang/IllegalStateException;

    const/4 p1, 0x0

    throw p1
.end method
