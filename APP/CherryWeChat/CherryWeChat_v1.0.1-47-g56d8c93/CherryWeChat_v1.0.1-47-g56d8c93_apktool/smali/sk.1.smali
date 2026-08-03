.class public interface abstract Lsk;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:LGn;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LEn;

    sget-object v0, LEn;->a:Ljava/util/Map;

    new-instance v1, LGn;

    invoke-direct {v1, v0}, LGn;-><init>(Ljava/util/Map;)V

    sput-object v1, Lsk;->a:LGn;

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/Map;
.end method
