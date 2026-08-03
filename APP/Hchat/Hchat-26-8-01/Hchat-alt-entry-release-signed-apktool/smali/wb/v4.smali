.class public final synthetic Lwb/v4;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Lwb/y2;

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ly0/o;

.field public final synthetic k:J

.field public final synthetic l:J


# direct methods
.method public synthetic constructor <init>(Lwb/y2;Landroid/content/Context;Ljava/lang/String;Ly0/o;JJI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/v4;->g:Lwb/y2;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/v4;->h:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/v4;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/v4;->j:Ly0/o;

    .line 11
    .line 12
    iput-wide p5, p0, Lwb/v4;->k:J

    .line 13
    .line 14
    iput-wide p7, p0, Lwb/v4;->l:J

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v8, p1

    .line 2
    check-cast v8, Li0/h0;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const p1, 0x186181

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Li0/r;->C(I)I

    .line 13
    .line 14
    .line 15
    move-result v9

    .line 16
    iget-object v0, p0, Lwb/v4;->g:Lwb/y2;

    .line 17
    .line 18
    iget-object v1, p0, Lwb/v4;->h:Landroid/content/Context;

    .line 19
    .line 20
    iget-object v2, p0, Lwb/v4;->i:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v3, p0, Lwb/v4;->j:Ly0/o;

    .line 23
    .line 24
    iget-wide v4, p0, Lwb/v4;->k:J

    .line 25
    .line 26
    iget-wide v6, p0, Lwb/v4;->l:J

    .line 27
    .line 28
    invoke-virtual/range {v0 .. v9}, Lwb/y2;->D1(Landroid/content/Context;Ljava/lang/String;Ly0/o;JJLi0/h0;I)V

    .line 29
    .line 30
    .line 31
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 32
    .line 33
    return-object p1
.end method
