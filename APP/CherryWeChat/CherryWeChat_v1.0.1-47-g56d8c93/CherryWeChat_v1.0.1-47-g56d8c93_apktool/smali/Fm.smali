.class public final LFm;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LCx;


# static fields
.field public static final b:LFm;

.field public static final c:Ljava/lang/String;


# instance fields
.field public final synthetic a:Lqo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LFm;

    invoke-direct {v0}, LFm;-><init>()V

    sput-object v0, LFm;->b:LFm;

    const-string v0, "kotlinx.serialization.json.JsonObject"

    sput-object v0, LFm;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lsz;->a:Lsz;

    sget-object v0, Lvm;->a:Lvm;

    new-instance v1, Lqo;

    sget-object v2, Lsz;->b:Lru;

    invoke-virtual {v0}, Lvm;->getDescriptor()LCx;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lqo;-><init>(LCx;LCx;)V

    iput-object v1, p0, LFm;->a:Lqo;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)I
    .locals 1

    iget-object v0, p0, LFm;->a:Lqo;

    invoke-virtual {v0, p1}, Lqo;->a(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    sget-object v0, LFm;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final c()LfG;
    .locals 1

    iget-object v0, p0, LFm;->a:Lqo;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, LCz;->i:LCz;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget-object v0, p0, LFm;->a:Lqo;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x2

    return v0
.end method

.method public final e(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LFm;->a:Lqo;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, LFm;->a:Lqo;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    return v0
.end method

.method public final h()Z
    .locals 1

    iget-object v0, p0, LFm;->a:Lqo;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    return v0
.end method

.method public final i(I)Ljava/util/List;
    .locals 1

    iget-object v0, p0, LFm;->a:Lqo;

    invoke-virtual {v0, p1}, Lqo;->i(I)Ljava/util/List;

    sget-object p1, LKf;->a:LKf;

    return-object p1
.end method

.method public final j(I)LCx;
    .locals 1

    iget-object v0, p0, LFm;->a:Lqo;

    invoke-virtual {v0, p1}, Lqo;->j(I)LCx;

    move-result-object p1

    return-object p1
.end method

.method public final k(I)Z
    .locals 1

    iget-object v0, p0, LFm;->a:Lqo;

    invoke-virtual {v0, p1}, Lqo;->k(I)Z

    const/4 p1, 0x0

    return p1
.end method
