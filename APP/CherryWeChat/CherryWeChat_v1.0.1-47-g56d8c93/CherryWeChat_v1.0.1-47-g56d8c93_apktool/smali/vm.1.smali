.class public final Lvm;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LQm;


# static fields
.field public static final a:Lvm;

.field public static final b:LEx;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lvm;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lvm;->a:Lvm;

    sget-object v0, LUt;->g:LUt;

    const/4 v1, 0x0

    new-array v1, v1, [LCx;

    new-instance v2, LOb;

    const/16 v3, 0x17

    invoke-direct {v2, v3}, LOb;-><init>(I)V

    const-string v3, "kotlinx.serialization.json.JsonElement"

    invoke-static {v3, v0, v1, v2}, LTB;->d(Ljava/lang/String;LfG;[LCx;Lfj;)LEx;

    move-result-object v0

    sput-object v0, Lvm;->b:LEx;

    return-void
.end method


# virtual methods
.method public final deserialize(LJc;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, LQj;->a(LJc;)Lkz;

    move-result-object p1

    invoke-virtual {p1}, Lkz;->A0()Lkotlinx/serialization/json/b;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()LCx;
    .locals 1

    sget-object v0, Lvm;->b:LEx;

    return-object v0
.end method

.method public final serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lkotlinx/serialization/json/b;

    new-instance p1, Ljava/lang/IllegalStateException;

    const/4 p1, 0x0

    throw p1
.end method
