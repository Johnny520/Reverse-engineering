.class public final La/A5$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/A5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation


# instance fields
.field public final synthetic a:La/A5;


# direct methods
.method public constructor <init>(La/A5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/A5$f;->a:La/A5;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, La/A5$f;->a:La/A5;

    iput-object v0, v1, La/A5;->l:La/A5$f;

    invoke-virtual {v1}, La/A5;->drawableStateChanged()V

    return-void
.end method
