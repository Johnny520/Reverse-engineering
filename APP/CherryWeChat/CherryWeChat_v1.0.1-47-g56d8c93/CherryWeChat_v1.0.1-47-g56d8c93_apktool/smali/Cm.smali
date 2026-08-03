.class public abstract LCm;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LQm;


# static fields
.field public static final a:Lru;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "kotlinx.serialization.json.JsonLiteral"

    sget-object v1, Lmu;->o:Lmu;

    invoke-static {v0, v1}, LTB;->b(Ljava/lang/String;Lnu;)Lru;

    move-result-object v0

    sput-object v0, LCm;->a:Lru;

    return-void
.end method
