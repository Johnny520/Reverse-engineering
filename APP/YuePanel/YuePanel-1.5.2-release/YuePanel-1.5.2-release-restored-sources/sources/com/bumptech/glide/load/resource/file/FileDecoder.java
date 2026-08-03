package com.bumptech.glide.load.resource.file;

import Yue.InterfaceC6391;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class FileDecoder implements ResourceDecoder<File, File> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: handles(Ljava/lang/Object;Lcom/bumptech/glide/load/Options;)Z */
    @Override // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@InterfaceC6391 File file, @InterfaceC6391 Options options) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: decode(Ljava/lang/Object;IILcom/bumptech/glide/load/Options;)Lcom/bumptech/glide/load/engine/Resource; */
    @Override // com.bumptech.glide.load.ResourceDecoder
    public Resource<File> decode(@InterfaceC6391 File file, int i, int i2, @InterfaceC6391 Options options) {
        return new FileResource(file);
    }
}
