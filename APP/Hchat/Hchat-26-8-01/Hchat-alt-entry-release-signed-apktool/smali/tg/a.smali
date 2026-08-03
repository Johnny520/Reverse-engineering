.class public final Ltg/a;
.super Lyf/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public g:Lug/k;

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lm/a;

.field public j:I


# direct methods
.method public constructor <init>(Lm/a;Lwf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltg/a;->i:Lm/a;

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
    .locals 1

    .line 1
    iput-object p1, p0, Ltg/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Ltg/a;->j:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Ltg/a;->j:I

    .line 9
    .line 10
    iget-object p1, p0, Ltg/a;->i:Lm/a;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, Lm/a;->b(Ltg/e;Lwf/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
