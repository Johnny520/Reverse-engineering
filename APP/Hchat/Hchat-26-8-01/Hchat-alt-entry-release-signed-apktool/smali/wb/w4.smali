.class public final synthetic Lwb/w4;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:Lwb/y2;

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Lp/x0;

.field public final synthetic k:J

.field public final synthetic l:Lfg/l;

.field public final synthetic m:I

.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(Lwb/y2;Landroid/content/Context;Ljava/lang/String;Lp/x0;JLfg/l;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/w4;->g:Lwb/y2;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/w4;->h:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/w4;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/w4;->j:Lp/x0;

    .line 11
    .line 12
    iput-wide p5, p0, Lwb/w4;->k:J

    .line 13
    .line 14
    iput-object p7, p0, Lwb/w4;->l:Lfg/l;

    .line 15
    .line 16
    iput p8, p0, Lwb/w4;->m:I

    .line 17
    .line 18
    iput p9, p0, Lwb/w4;->n:I

    .line 19
    .line 20
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
    iget p1, p0, Lwb/w4;->m:I

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
    iget-object v0, p0, Lwb/w4;->g:Lwb/y2;

    .line 18
    .line 19
    iget-object v1, p0, Lwb/w4;->h:Landroid/content/Context;

    .line 20
    .line 21
    iget-object v2, p0, Lwb/w4;->i:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v3, p0, Lwb/w4;->j:Lp/x0;

    .line 24
    .line 25
    iget-wide v4, p0, Lwb/w4;->k:J

    .line 26
    .line 27
    iget-object v6, p0, Lwb/w4;->l:Lfg/l;

    .line 28
    .line 29
    iget v9, p0, Lwb/w4;->n:I

    .line 30
    .line 31
    invoke-virtual/range {v0 .. v9}, Lwb/y2;->i(Landroid/content/Context;Ljava/lang/String;Lp/x0;JLfg/l;Li0/h0;II)V

    .line 32
    .line 33
    .line 34
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 35
    .line 36
    return-object p1
.end method
