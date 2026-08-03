.class public final La/ab$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/ab;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Landroidx/lifecycle/e;

.field public b:Landroidx/lifecycle/g;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/e;Landroidx/lifecycle/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ab$a;->a:Landroidx/lifecycle/e;

    iput-object p2, p0, La/ab$a;->b:Landroidx/lifecycle/g;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/e;->a(La/x9;)V

    return-void
.end method
