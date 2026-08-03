.class public final La/S4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/Pd;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La/Pd<",
        "La/f9;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:La/i0;


# direct methods
.method public constructor <init>(Ljava/lang/String;La/i0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/S4;->a:Ljava/lang/String;

    iput-object p2, p0, La/S4;->b:La/i0;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "La/f9;",
            ">;"
        }
    .end annotation

    new-instance v0, La/S4$a;

    invoke-direct {v0, p0}, La/S4$a;-><init>(La/S4;)V

    return-object v0
.end method
