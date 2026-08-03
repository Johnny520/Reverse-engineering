.class public final Landroidx/activity/result/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/activity/result/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:La/X;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/X<",
            "TO;>;"
        }
    .end annotation
.end field

.field public final b:La/Y;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/Y<",
            "*TO;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(La/Y;La/X;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/activity/result/a$a;->a:La/X;

    iput-object p1, p0, Landroidx/activity/result/a$a;->b:La/Y;

    return-void
.end method
