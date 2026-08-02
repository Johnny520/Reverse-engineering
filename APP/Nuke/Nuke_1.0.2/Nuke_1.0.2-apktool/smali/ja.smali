.class public final Lja;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic i:Ld22;

.field public final synthetic j:Lxm0;

.field public final synthetic k:Lh22;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Ld61;


# direct methods
.method public constructor <init>(Ld22;Lxm0;Lh22;Ljava/lang/String;Ld61;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lja;->i:Ld22;

    .line 2
    .line 3
    iput-object p2, p0, Lja;->j:Lxm0;

    .line 4
    .line 5
    iput-object p3, p0, Lja;->k:Lh22;

    .line 6
    .line 7
    iput-object p4, p0, Lja;->l:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Lja;->m:Ld61;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lja;->l:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lja;->m:Ld61;

    .line 4
    .line 5
    iget-object v2, p0, Lja;->i:Ld22;

    .line 6
    .line 7
    iget-object v3, p0, Lja;->j:Lxm0;

    .line 8
    .line 9
    iget-object p0, p0, Lja;->k:Lh22;

    .line 10
    .line 11
    invoke-virtual {v2, v3, p0, v0, v1}, Ld22;->o(Lxm0;Lh22;Ljava/lang/String;Ld61;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, La83;->a:La83;

    .line 15
    .line 16
    return-object p0
.end method
