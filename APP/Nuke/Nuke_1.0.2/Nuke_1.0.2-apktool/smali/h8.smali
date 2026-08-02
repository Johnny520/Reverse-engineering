.class public final Lh8;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic i:Lp80;

.field public final synthetic j:Lxm0;

.field public final synthetic k:Ln80;

.field public final synthetic l:Ld61;


# direct methods
.method public constructor <init>(Lp80;Lxm0;Ln80;Ld61;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh8;->i:Lp80;

    .line 2
    .line 3
    iput-object p2, p0, Lh8;->j:Lxm0;

    .line 4
    .line 5
    iput-object p3, p0, Lh8;->k:Ln80;

    .line 6
    .line 7
    iput-object p4, p0, Lh8;->l:Ld61;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lh8;->k:Ln80;

    .line 2
    .line 3
    iget-object v1, p0, Lh8;->l:Ld61;

    .line 4
    .line 5
    iget-object v2, p0, Lh8;->i:Lp80;

    .line 6
    .line 7
    iget-object p0, p0, Lh8;->j:Lxm0;

    .line 8
    .line 9
    invoke-virtual {v2, p0, v0, v1}, Lp80;->e(Lxm0;Ln80;Ld61;)V

    .line 10
    .line 11
    .line 12
    sget-object p0, La83;->a:La83;

    .line 13
    .line 14
    return-object p0
.end method
