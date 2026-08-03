.class public final La/Jf;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/Jf$a;
    }
.end annotation


# static fields
.field public static d:La/Jf;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/location/LocationManager;

.field public final c:La/Jf$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/location/LocationManager;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La/Jf$a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La/Jf;->c:La/Jf$a;

    iput-object p1, p0, La/Jf;->a:Landroid/content/Context;

    iput-object p2, p0, La/Jf;->b:Landroid/location/LocationManager;

    return-void
.end method
