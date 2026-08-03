.class public final La/Wd$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/Wd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:La/Wd;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La/Wd;

    invoke-direct {v0}, La/Wd;-><init>()V

    sput-object v0, La/Wd$a;->a:La/Wd;

    return-void
.end method
