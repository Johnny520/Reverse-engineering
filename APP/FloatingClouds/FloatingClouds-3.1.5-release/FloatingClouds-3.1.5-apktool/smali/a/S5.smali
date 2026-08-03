.class public final La/S5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/S5$b;,
        La/S5$c;,
        La/S5$a;
    }
.end annotation


# instance fields
.field public final a:La/S5$b;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La/S5$c;

    invoke-direct {v0, p1}, La/S5$c;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, La/S5;->a:La/S5$b;

    return-void
.end method
