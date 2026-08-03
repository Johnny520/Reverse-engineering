.class public final synthetic Lwb/ip;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Lwb/y2;

.field public final synthetic h:Lgb/c;

.field public final synthetic i:Z

.field public final synthetic j:Z

.field public final synthetic k:Z

.field public final synthetic l:Lfg/a;


# direct methods
.method public synthetic constructor <init>(Lwb/y2;Lgb/c;ZZZLfg/a;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/ip;->g:Lwb/y2;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/ip;->h:Lgb/c;

    .line 7
    .line 8
    iput-boolean p3, p0, Lwb/ip;->i:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Lwb/ip;->j:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lwb/ip;->k:Z

    .line 13
    .line 14
    iput-object p6, p0, Lwb/ip;->l:Lfg/a;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    move-object v6, p1

    .line 2
    check-cast v6, Li0/h0;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const p1, 0x30001

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Li0/r;->C(I)I

    .line 13
    .line 14
    .line 15
    move-result v7

    .line 16
    iget-object v0, p0, Lwb/ip;->g:Lwb/y2;

    .line 17
    .line 18
    iget-object v1, p0, Lwb/ip;->h:Lgb/c;

    .line 19
    .line 20
    iget-boolean v2, p0, Lwb/ip;->i:Z

    .line 21
    .line 22
    iget-boolean v3, p0, Lwb/ip;->j:Z

    .line 23
    .line 24
    iget-boolean v4, p0, Lwb/ip;->k:Z

    .line 25
    .line 26
    iget-object v5, p0, Lwb/ip;->l:Lfg/a;

    .line 27
    .line 28
    invoke-virtual/range {v0 .. v7}, Lwb/y2;->B(Lgb/c;ZZZLfg/a;Li0/h0;I)V

    .line 29
    .line 30
    .line 31
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 32
    .line 33
    return-object p1
.end method
