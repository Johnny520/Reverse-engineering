.class public final synthetic Lwb/ig;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Z

.field public final synthetic k:Lfg/a;

.field public final synthetic l:Lfg/a;

.field public final synthetic m:Lfg/l;


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/String;Ljava/lang/String;ZLfg/a;Lfg/a;Lfg/l;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lwb/ig;->g:Z

    .line 5
    .line 6
    iput-object p2, p0, Lwb/ig;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/ig;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-boolean p4, p0, Lwb/ig;->j:Z

    .line 11
    .line 12
    iput-object p5, p0, Lwb/ig;->k:Lfg/a;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/ig;->l:Lfg/a;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/ig;->m:Lfg/l;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, Li0/h0;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-static {p1}, Li0/r;->C(I)I

    .line 11
    .line 12
    .line 13
    move-result v8

    .line 14
    iget-boolean v0, p0, Lwb/ig;->g:Z

    .line 15
    .line 16
    iget-object v1, p0, Lwb/ig;->h:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v2, p0, Lwb/ig;->i:Ljava/lang/String;

    .line 19
    .line 20
    iget-boolean v3, p0, Lwb/ig;->j:Z

    .line 21
    .line 22
    iget-object v4, p0, Lwb/ig;->k:Lfg/a;

    .line 23
    .line 24
    iget-object v5, p0, Lwb/ig;->l:Lfg/a;

    .line 25
    .line 26
    iget-object v6, p0, Lwb/ig;->m:Lfg/l;

    .line 27
    .line 28
    invoke-static/range {v0 .. v8}, Lwb/ho;->s3(ZLjava/lang/String;Ljava/lang/String;ZLfg/a;Lfg/a;Lfg/l;Li0/h0;I)V

    .line 29
    .line 30
    .line 31
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 32
    .line 33
    return-object p1
.end method
