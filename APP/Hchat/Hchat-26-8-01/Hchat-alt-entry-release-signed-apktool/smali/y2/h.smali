.class public final Ly2/h;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:Ly2/x;

.field public final synthetic h:Lfg/a;

.field public final synthetic i:Ly2/c0;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Lu2/m;


# direct methods
.method public constructor <init>(Ly2/x;Lfg/a;Ly2/c0;Ljava/lang/String;Lu2/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly2/h;->g:Ly2/x;

    .line 2
    .line 3
    iput-object p2, p0, Ly2/h;->h:Lfg/a;

    .line 4
    .line 5
    iput-object p3, p0, Ly2/h;->i:Ly2/c0;

    .line 6
    .line 7
    iput-object p4, p0, Ly2/h;->j:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Ly2/h;->k:Lu2/m;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Ly2/h;->j:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Ly2/h;->k:Lu2/m;

    .line 4
    .line 5
    iget-object v2, p0, Ly2/h;->g:Ly2/x;

    .line 6
    .line 7
    iget-object v3, p0, Ly2/h;->h:Lfg/a;

    .line 8
    .line 9
    iget-object v4, p0, Ly2/h;->i:Ly2/c0;

    .line 10
    .line 11
    invoke-virtual {v2, v3, v4, v0, v1}, Ly2/x;->o(Lfg/a;Ly2/c0;Ljava/lang/String;Lu2/m;)V

    .line 12
    .line 13
    .line 14
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 15
    .line 16
    return-object v0
.end method
