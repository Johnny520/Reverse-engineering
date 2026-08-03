.class public abstract Llz;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [LCx;

    sget-object v1, LjC;->b:Lpl;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, LoC;->b:Lpl;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, LeC;->b:Lpl;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, LtC;->b:Lpl;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-static {v0}, LLx;->B([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Llz;->a:Ljava/util/Set;

    return-void
.end method
