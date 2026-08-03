.class public final LJm;
.super LFb;
.source ""


# instance fields
.field public d:LMc;

.field public e:Ln;

.field public f:Ljava/util/LinkedHashMap;

.field public g:Ljava/lang/String;

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ln;

.field public j:I


# direct methods
.method public constructor <init>(Ln;Lu5;)V
    .locals 0

    iput-object p1, p0, LJm;->i:Ln;

    invoke-direct {p0, p2}, LFb;-><init>(LEb;)V

    return-void
.end method


# virtual methods
.method public final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, LJm;->h:Ljava/lang/Object;

    iget p1, p0, LJm;->j:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LJm;->j:I

    iget-object p1, p0, LJm;->i:Ln;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Ln;->a(Ln;LMc;Lu5;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
