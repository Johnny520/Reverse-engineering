.class public final Lz0/c;
.super Lz0/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ld1/j;


# instance fields
.field public final g:Lxe/e;

.field public final h:Lf2/s;

.field public final i:Ly1/t;

.field public final j:Lg2/b;

.field public final k:Ljava/lang/String;

.field public final l:Landroid/graphics/Rect;

.field public final m:Landroid/view/autofill/AutofillId;

.field public final n:Lf/x;

.field public o:Z


# direct methods
.method public constructor <init>(Lxe/e;Lf2/s;Ly1/t;Lg2/b;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz0/c;->g:Lxe/e;

    .line 5
    .line 6
    iput-object p2, p0, Lz0/c;->h:Lf2/s;

    .line 7
    .line 8
    iput-object p3, p0, Lz0/c;->i:Ly1/t;

    .line 9
    .line 10
    iput-object p4, p0, Lz0/c;->j:Lg2/b;

    .line 11
    .line 12
    iput-object p5, p0, Lz0/c;->k:Ljava/lang/String;

    .line 13
    .line 14
    new-instance p1, Landroid/graphics/Rect;

    .line 15
    .line 16
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lz0/c;->l:Landroid/graphics/Rect;

    .line 20
    .line 21
    const/4 p1, 0x1

    .line 22
    invoke-virtual {p3, p1}, Landroid/view/View;->setImportantForAutofill(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p3}, Landroid/view/View;->getAutofillId()Landroid/view/autofill/AutofillId;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    iput-object p1, p0, Lz0/c;->m:Landroid/view/autofill/AutofillId;

    .line 32
    .line 33
    new-instance p1, Lf/x;

    .line 34
    .line 35
    invoke-direct {p1}, Lf/x;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lz0/c;->n:Lf/x;

    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    const-string p1, "Required value was null."

    .line 42
    .line 43
    invoke-static {p1}, Lwb/en;->a(Ljava/lang/String;)Laf/d;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    throw p1
.end method


# virtual methods
.method public final e(Ld1/b0;Ld1/b0;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-static {p1}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1}, Lx1/f0;->w()Lf2/m;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, v0, Lf2/m;->g:Lf/k0;

    .line 16
    .line 17
    sget-object v1, Lf2/l;->g:Lf2/x;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lf/k0;->b(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    sget-object v1, Lf2/l;->h:Lf2/x;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lf/k0;->b(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    :cond_0
    iget p1, p1, Lx1/f0;->h:I

    .line 34
    .line 35
    iget-object v0, p0, Lz0/c;->g:Lxe/e;

    .line 36
    .line 37
    iget-object v0, v0, Lxe/e;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Landroid/view/autofill/AutofillManager;

    .line 40
    .line 41
    iget-object v1, p0, Lz0/c;->i:Ly1/t;

    .line 42
    .line 43
    invoke-virtual {v0, v1, p1}, Landroid/view/autofill/AutofillManager;->notifyViewExited(Landroid/view/View;I)V

    .line 44
    .line 45
    .line 46
    :cond_1
    if-eqz p2, :cond_4

    .line 47
    .line 48
    invoke-static {p2}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-eqz p1, :cond_4

    .line 53
    .line 54
    invoke-virtual {p1}, Lx1/f0;->w()Lf2/m;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    if-eqz p2, :cond_4

    .line 59
    .line 60
    iget-object p2, p2, Lf2/m;->g:Lf/k0;

    .line 61
    .line 62
    sget-object v0, Lf2/l;->g:Lf2/x;

    .line 63
    .line 64
    invoke-virtual {p2, v0}, Lf/k0;->b(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_3

    .line 69
    .line 70
    sget-object v0, Lf2/l;->h:Lf2/x;

    .line 71
    .line 72
    invoke-virtual {p2, v0}, Lf/k0;->b(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    if-eqz p2, :cond_2

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    return-void

    .line 80
    :cond_3
    :goto_0
    iget p1, p1, Lx1/f0;->h:I

    .line 81
    .line 82
    iget-object p2, p0, Lz0/c;->j:Lg2/b;

    .line 83
    .line 84
    iget-object p2, p2, Lg2/b;->b:Lac/k;

    .line 85
    .line 86
    new-instance v0, Lz0/a;

    .line 87
    .line 88
    invoke-direct {v0, p0, p1}, Lz0/a;-><init>(Lz0/c;I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, p1, v0}, Lac/k;->P(ILfg/r;)V

    .line 92
    .line 93
    .line 94
    :cond_4
    return-void
.end method
