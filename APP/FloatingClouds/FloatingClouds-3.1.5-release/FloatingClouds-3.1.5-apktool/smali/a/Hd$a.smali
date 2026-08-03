.class public final La/Hd$a;
.super La/u9;
.source "SourceFile"

# interfaces
.implements La/s7;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/Hd;-><init>(Landroidx/savedstate/a;La/Gg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/u9;",
        "La/s7<",
        "La/Id;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:La/Gg;


# direct methods
.method public constructor <init>(La/Gg;)V
    .locals 0

    iput-object p1, p0, La/Hd$a;->b:La/Gg;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, La/u9;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, La/Hd$a;->b:La/Gg;

    invoke-static {v0}, Landroidx/lifecycle/n;->c(La/Gg;)La/Id;

    move-result-object v0

    return-object v0
.end method
