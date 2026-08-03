.class public abstract LKj;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lut;

.field public static final b:Lut;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "com.bumptech.glide.load.resource.gif.GifOptions.DecodeFormat"

    sget-object v1, LEc;->c:LEc;

    invoke-static {v0, v1}, Lut;->a(Ljava/lang/String;Ljava/lang/Object;)Lut;

    move-result-object v0

    sput-object v0, LKj;->a:Lut;

    const-string v0, "com.bumptech.glide.load.resource.gif.GifOptions.DisableAnimation"

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lut;->a(Ljava/lang/String;Ljava/lang/Object;)Lut;

    move-result-object v0

    sput-object v0, LKj;->b:Lut;

    return-void
.end method
