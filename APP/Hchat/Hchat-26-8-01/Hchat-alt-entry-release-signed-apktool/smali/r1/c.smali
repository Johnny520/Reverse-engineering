.class public final Lr1/c;
.super Lyf/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public synthetic g:Ljava/lang/Object;

.field public final synthetic h:Lr1/d;

.field public i:I


# direct methods
.method public constructor <init>(Lr1/d;Lyf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr1/c;->h:Lr1/d;

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
    .locals 2

    .line 1
    iput-object p1, p0, Lr1/c;->g:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lr1/c;->i:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lr1/c;->i:I

    .line 9
    .line 10
    iget-object p1, p0, Lr1/c;->h:Lr1/d;

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1, p0}, Lr1/d;->c(JLyf/c;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method
