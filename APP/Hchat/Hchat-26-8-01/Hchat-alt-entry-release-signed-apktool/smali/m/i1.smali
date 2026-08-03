.class public final Lm/i1;
.super Lyf/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public g:Lm/o2;

.field public h:Lgg/r;

.field public i:F

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lm/l1;

.field public l:I


# direct methods
.method public constructor <init>(Lm/l1;Lyf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm/i1;->k:Lm/l1;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lyf/c;-><init>(Lwf/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iput-object p1, p0, Lm/i1;->j:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lm/i1;->l:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lm/i1;->l:I

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    iget-object v0, p0, Lm/i1;->k:Lm/l1;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    move-object v5, p0

    .line 17
    invoke-static/range {v0 .. v5}, Lm/l1;->c(Lm/l1;Lm/o2;Lm/h1;FFLyf/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method
