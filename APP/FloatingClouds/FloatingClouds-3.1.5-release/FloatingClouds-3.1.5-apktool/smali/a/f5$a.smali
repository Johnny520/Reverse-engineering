.class public final La/f5$a;
.super La/u9;
.source "SourceFile"

# interfaces
.implements La/s7;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/f5;-><init>(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/u9;",
        "La/s7<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:La/f5;


# direct methods
.method public constructor <init>(La/f5;)V
    .locals 0

    iput-object p1, p0, La/f5$a;->b:La/f5;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, La/u9;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, La/f5$a;->b:La/f5;

    iget-object v2, v1, La/f5;->c:Ljava/util/ArrayList;

    sget-object v3, La/e5;->b:La/e5;

    const-string v4, ""

    const/16 v5, 0x1e

    invoke-static {v2, v4, v3, v5}, La/t3;->p0(Ljava/util/Collection;Ljava/lang/String;La/D7;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, La/f5;->d:Ljava/lang/String;

    invoke-static {v1}, La/h5;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
