.class public final LGm;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LQm;


# static fields
.field public static final a:LGm;

.field public static final b:LFm;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LGm;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LGm;->a:LGm;

    sget-object v0, LFm;->b:LFm;

    sput-object v0, LGm;->b:LFm;

    return-void
.end method


# virtual methods
.method public final deserialize(LJc;)Ljava/lang/Object;
    .locals 2

    invoke-static {p1}, LQj;->a(LJc;)Lkz;

    new-instance v0, Lkotlinx/serialization/json/c;

    sget-object v1, Lsz;->a:Lsz;

    sget-object v1, Lvm;->a:Lvm;

    new-instance v1, Lro;

    invoke-direct {v1}, Lro;-><init>()V

    invoke-virtual {v1, p1}, Lt;->d(LJc;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {v0, p1}, Lkotlinx/serialization/json/c;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public final getDescriptor()LCx;
    .locals 1

    sget-object v0, LGm;->b:LFm;

    return-object v0
.end method

.method public final serialize(LOf;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lkotlinx/serialization/json/c;

    new-instance p1, Ljava/lang/IllegalStateException;

    const/4 p1, 0x0

    throw p1
.end method
