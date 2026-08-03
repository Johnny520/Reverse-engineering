.class public final Lo1;
.super LWp;
.source ""


# instance fields
.field public final l:Lw1;

.field public final m:Lz6;


# direct methods
.method public constructor <init>(Lw1;Lz6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1;->l:Lw1;

    iput-object p2, p0, Lo1;->m:Lz6;

    return-void
.end method


# virtual methods
.method public final N()Lz6;
    .locals 1

    iget-object v0, p0, Lo1;->m:Lz6;

    return-object v0
.end method

.method public final O()Lj1;
    .locals 1

    iget-object v0, p0, Lo1;->l:Lw1;

    return-object v0
.end method
