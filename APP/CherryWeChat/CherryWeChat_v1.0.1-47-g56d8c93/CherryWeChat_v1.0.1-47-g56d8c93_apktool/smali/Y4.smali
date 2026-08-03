.class public final LY4;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:LY4;

.field public static b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, -0x16161fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, LY4;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LY4;->a:LY4;

    return-void
.end method

.method public static a(Landroid/content/Context;Lfj;Lfj;Z)V
    .locals 7

    const-wide v0, -0x162c0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-boolean v0, LY4;->b:Z

    if-eqz v0, :cond_0

    const-wide p0, -0x162c8fffff835L

    invoke-static {p0, p1}, LGu;->r(J)Ljava/lang/String;

    const-wide p0, -0x162d9fffff835L

    invoke-static {p0, p1}, LGu;->r(J)Ljava/lang/String;

    return-void

    :cond_0
    if-nez p3, :cond_1

    invoke-static {p0}, LY4;->b(Landroid/content/Context;)Z

    move-result p3

    if-nez p3, :cond_1

    const-wide p2, -0x162e6fffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    const-wide p2, -0x162f7fffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    const-wide p2, -0x162fefffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    invoke-static {}, Lgf;->I()Ljava/lang/String;

    move-result-object v1

    sget-object p3, Lm0;->a:Lm0;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, v1}, Lm0;->c(Landroid/content/Context;Ljava/lang/String;)Ll0;

    move-result-object v2

    if-nez v2, :cond_2

    const-wide p0, -0x162fffffff835L

    invoke-static {p0, p1}, LGu;->r(J)Ljava/lang/String;

    const-wide p0, -0x16290fffff835L

    invoke-static {p0, p1}, LGu;->r(J)Ljava/lang/String;

    const-wide p0, -0x162a3fffff835L

    invoke-static {p0, p1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p2, p0}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    const/4 p0, 0x1

    sput-boolean p0, LY4;->b:Z

    const-wide v3, -0x162affffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x16140fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    sget-object p0, Lhe;->a:Lhd;

    sget-object p0, LVc;->b:LVc;

    invoke-static {p0}, LPj;->a(Lac;)LCb;

    move-result-object p0

    new-instance v0, LW4;

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v6}, LW4;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;LEb;I)V

    const/4 p1, 0x3

    invoke-static {p0, v0, p1}, LNj;->G(Lfc;Lkotlin/jvm/functions/Function2;I)V

    return-void
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 4

    const-wide v0, -0x1626afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-static {}, Lgf;->I()Ljava/lang/String;

    move-result-object v0

    sget-object v1, LEA;->a:LEA;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, LEA;->b:Ljava/lang/String;

    invoke-static {v1, v0}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lm0;->a:Lm0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, v0}, Lm0;->b(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    const-wide v2, -0x16272fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x16203fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x16218fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x16225fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    sget-object v2, Lm0;->a:Lm0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0, v0}, Lm0;->b(Landroid/content/Context;Ljava/lang/String;)Z

    const-wide v2, -0x16233fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    return v1
.end method
