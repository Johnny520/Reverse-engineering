.class public final La/K5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/K5$b;,
        La/K5$a;
    }
.end annotation


# instance fields
.field public final a:La/K5$a;


# direct methods
.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La/K5$a;

    invoke-direct {v0, p1}, La/K5$a;-><init>(Landroid/widget/EditText;)V

    iput-object v0, p0, La/K5;->a:La/K5$a;

    return-void
.end method
