.class public final La/Xe$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/Xe;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:La/Xe$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La/Xe$a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/Xe$a;->a:La/Xe$a;

    return-void
.end method
