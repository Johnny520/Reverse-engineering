.class public LYue/ۥ۠ۤۤ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final ۥ:LYue/ۥۢ۠۟۟;

.field public final ۥ۟:LYue/ۥۢ۠۟۟$ۥ۟۟۟۟;

.field public ۥ۟۟:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟:LYue/ۥ۠ۤۤۡ;


# direct methods
.method public constructor <init>(LYue/ۥۢ۠۟۟;LYue/ۥۢ۠۟۟$ۥ۟۟۟۟;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥ۠ۤۤ۟;->ۥ۟۟:Ljava/util/ArrayList;

    iput-object p1, p0, LYue/ۥ۠ۤۤ۟;->ۥ:LYue/ۥۢ۠۟۟;

    iput-object p2, p0, LYue/ۥ۠ۤۤ۟;->ۥ۟:LYue/ۥۢ۠۟۟$ۥ۟۟۟۟;

    return-void
.end method


# virtual methods
.method public varargs ۥ([Ljava/lang/Object;)LYue/ۥ۠ۤۤ۟;
    .locals 4

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    iget-object v3, p0, LYue/ۥ۠ۤۤ۟;->ۥ۟۟:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public ۥ۟()V
    .locals 0

    return-void
.end method

.method public ۥ۟۟()LYue/ۥ۠ۤۤۡ;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۤ۟;->ۥ۟۟۟:LYue/ۥ۠ۤۤۡ;

    return-object v0
.end method

.method public ۥ۟۟۟()LYue/ۥۢ۠۟۟$ۥ۟۟۟۟;
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۤۤ۟;->ۥ۟:LYue/ۥۢ۠۟۟$ۥ۟۟۟۟;

    return-object v0
.end method

.method public ۥ۟۟۟۟(LYue/ۥ۠ۤۤۡ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۠ۤۤ۟;->ۥ۟۟۟:LYue/ۥ۠ۤۤۡ;

    return-void
.end method
