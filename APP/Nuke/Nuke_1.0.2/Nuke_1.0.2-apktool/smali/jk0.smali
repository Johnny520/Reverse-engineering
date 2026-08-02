.class public final Ljk0;
.super Lu00;


# instance fields
.field public synthetic k:Ljava/lang/Object;

.field public l:I

.field public final synthetic m:Lha0;

.field public n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lha0;Lt00;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ljk0;->m:Lha0;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lu00;-><init>(Lt00;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final r(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Ljk0;->k:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Ljk0;->l:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Ljk0;->l:I

    .line 9
    .line 10
    iget-object p1, p0, Ljk0;->m:Lha0;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, Lha0;->m(Ljava/lang/Object;Lt00;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
