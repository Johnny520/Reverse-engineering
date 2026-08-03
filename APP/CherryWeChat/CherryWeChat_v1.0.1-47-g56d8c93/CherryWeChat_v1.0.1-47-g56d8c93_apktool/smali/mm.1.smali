.class public abstract Lmm;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final d:Llm;


# instance fields
.field public final a:Lpm;

.field public final b:Lhw;

.field public final c:LD2;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Llm;

    new-instance v1, Lpm;

    const/4 v8, 0x1

    const/4 v9, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const-string v5, "    "

    const/4 v6, 0x0

    const-string v7, "type"

    invoke-direct/range {v1 .. v9}, Lpm;-><init>(ZZZLjava/lang/String;ZLjava/lang/String;ZI)V

    sget-object v2, LPj;->e:Lhw;

    invoke-direct {v0, v1, v2}, Lmm;-><init>(Lpm;Lhw;)V

    sput-object v0, Lmm;->d:Llm;

    return-void
.end method

.method public constructor <init>(Lpm;Lhw;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmm;->a:Lpm;

    iput-object p2, p0, Lmm;->b:Lhw;

    new-instance p1, LD2;

    const/16 p2, 0x10

    invoke-direct {p1, p2}, LD2;-><init>(I)V

    iput-object p1, p0, Lmm;->c:LD2;

    return-void
.end method


# virtual methods
.method public final a(LQm;Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    new-instance v0, Loz;

    invoke-direct {v0, p2}, Loz;-><init>(Ljava/lang/String;)V

    new-instance v1, Lkz;

    invoke-interface {p1}, LQm;->getDescriptor()LCx;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v1, p0, v3, v0, v2}, Lkz;-><init>(Lmm;ILoz;LCx;)V

    invoke-virtual {v1, p1}, Lkz;->h(LQm;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0}, Loz;->e()B

    move-result v1

    const/16 v2, 0xa

    if-ne v1, v2, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Expected EOF after parsing, but had "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v0, Loz;->a:I

    sub-int/2addr v1, v3

    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p2, " instead"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v1, 0x6

    invoke-static {v0, p1, p2, v1}, Loz;->m(Loz;Ljava/lang/String;II)V

    const/4 p1, 0x0

    throw p1
.end method
