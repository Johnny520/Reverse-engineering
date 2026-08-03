.class public final synthetic Lwb/pm;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lsh/x;

.field public final synthetic j:Lfg/a;

.field public final synthetic k:Lfg/q;

.field public final synthetic l:Lfg/q;

.field public final synthetic m:Ls0/d;

.field public final synthetic n:I

.field public final synthetic o:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lsh/x;Lfg/a;Lfg/q;Lfg/q;Ls0/d;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/pm;->g:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/pm;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/pm;->i:Lsh/x;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/pm;->j:Lfg/a;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/pm;->k:Lfg/q;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/pm;->l:Lfg/q;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/pm;->m:Ls0/d;

    .line 17
    .line 18
    iput p8, p0, Lwb/pm;->n:I

    .line 19
    .line 20
    iput p9, p0, Lwb/pm;->o:I

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

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
    iget p1, p0, Lwb/pm;->n:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Li0/r;->C(I)I

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    iget-object v0, p0, Lwb/pm;->g:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, p0, Lwb/pm;->h:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v2, p0, Lwb/pm;->i:Lsh/x;

    .line 22
    .line 23
    iget-object v3, p0, Lwb/pm;->j:Lfg/a;

    .line 24
    .line 25
    iget-object v4, p0, Lwb/pm;->k:Lfg/q;

    .line 26
    .line 27
    iget-object v5, p0, Lwb/pm;->l:Lfg/q;

    .line 28
    .line 29
    iget-object v6, p0, Lwb/pm;->m:Ls0/d;

    .line 30
    .line 31
    iget v9, p0, Lwb/pm;->o:I

    .line 32
    .line 33
    invoke-static/range {v0 .. v9}, Lwb/ho;->B2(Ljava/lang/String;Ljava/lang/String;Lsh/x;Lfg/a;Lfg/q;Lfg/q;Ls0/d;Li0/h0;II)V

    .line 34
    .line 35
    .line 36
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 37
    .line 38
    return-object p1
.end method
